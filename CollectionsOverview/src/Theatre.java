import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>(); //can change

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 69.00;
                if ((row < 'D') && (seatNum >=4 && seatNum <=9)){
                    price = 80.00;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)){
                    price = 39.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNo) {

        Seat requestedSeat = new Seat(seatNo,0.00);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("Seat not available " + seatNo);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.println(".");
//            if (seat.getSeatNo().equals(seatNo)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if (requestedSeat == null) {
//            System.out.println("No seat with specified number!");
//            return false;
//        }
//        return requestedSeat.reserve(); //returns status - true
    }

//    public void getSeats() {
//        for (Seat seat : seats) {
//            System.out.println(seat.getSeatNo());
//        }
//    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNo;
        private boolean reserved = false;

        private double price;

        public Seat(String seatNo, double price) {
            this.seatNo = seatNo;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getSeatNo() {
            return seatNo;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNo + " reserved!");
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNo + " cancelled");
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNo.compareToIgnoreCase(seat.getSeatNo());
        }
    }
}
