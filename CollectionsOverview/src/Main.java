public class Main {
    public static void main(String[] args) {

        //Sets map, queues - Part of collections

        Theatre theatre = new Theatre("Jyothi Talkies", 20, 5); //it doesn't exist anymore ☹
        theatre.getSeats();

        if(theatre.reserveSeat("A02")){
            System.out.println("PAY ME CASH!");
        }else{
            System.out.println("Seat reserved");
        }

        //below won't work
//        if(theatre.reserveSeat("A02")){
//            System.out.println("PAY ME CASH!");
//        }else{
//            System.out.println("Seat reserved");
//        }
    }
}