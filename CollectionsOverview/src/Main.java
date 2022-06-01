import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Sets map, queues - Part of collections

        Theatre theatre = new Theatre("Jyothi Talkies", 20, 5); //it doesn't exist anymore ☹

        if (theatre.reserveSeat("A02")) {
            System.out.println("Pay for A02");
        } else {
            System.out.println("Already reserved!");
        }

        if (theatre.reserveSeat("D04")) {
            System.out.println("Pay for D04");
        } else {
            System.out.println("Already reserved!");
        }

        List<Theatre.Seat> reservedSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reservedSeats);
        printList(reservedSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNo()+ " "+ seat.getPrice());
        }
        System.out.println(" ");
        System.out.println("---------------");

    }
}