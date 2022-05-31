import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Sets map, queues - Part of collections

        Theatre theatre = new Theatre("Jyothi Talkies", 20, 5); //it doesn't exist anymore ☹
        List<Theatre.Seat> seatCpy = new ArrayList<>(theatre.seats);
        printList(seatCpy);

        seatCpy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Pay for A02");
        } else {
            System.out.println("Already reserved!");
        }
//both seatCpy and theatre share the same object

        Collections.shuffle(seatCpy);
        System.out.println("Printing seatCpy");
        printList(seatCpy);
        System.out.println("printing theatre.Seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCpy);
        Theatre.Seat maxSeat = Collections.max(seatCpy);
        System.out.println("Min seat no = "+minSeat.getSeatNo());
        System.out.println("Max seat no = "+maxSeat.getSeatNo());

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNo());
        }
        System.out.println(" ");
        System.out.println("---------------");
        ;
    }
}