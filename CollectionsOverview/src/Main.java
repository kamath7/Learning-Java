import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Sets map, queues - Part of collections

        Theatre theatre = new Theatre("Jyothi Talkies", 20, 5); //it doesn't exist anymore ☹
        List<Theatre.Seat> seatCpy = new ArrayList<>(theatre.seats);
        printList(seatCpy);

        seatCpy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Pay for A02");
        }else{
            System.out.println("Already reserved!");
        }
//both seatCpy and theatre share the same object
    }

    public static void printList(List <Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.println(" "+seat.getSeatNo());
        }
        System.out.println(" ");
        System.out.println("---------------");;
    }
}