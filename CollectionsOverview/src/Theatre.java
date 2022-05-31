import java.util.*;

public class Theatre {

    private final String theatreName;
    private Collection<Seat> seats = new ArrayList<>(); //can change

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNo) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.println(".");
            if (seat.getSeatNo().equals(seatNo)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("No seat with specified number!");
            return false;
        }
        return requestedSeat.reserve(); //returns status - true
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNo());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNo;
        private boolean reserved = false;

        public Seat(String seatNo) {
            this.seatNo = seatNo;
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

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat "+seatNo+" cancelled");
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
