public class Main {
    public static void main(String[] args) {

        StaticTst staticTst = new StaticTst("Joker");
        System.out.println(staticTst.getName()+". Instance num - "+StaticTst.getNumInstances());

        StaticTst staticTst1 = new StaticTst("Gateshead");
        System.out.println(staticTst1.getName()+". Instance num - "+StaticTst.getNumInstances());

    }
}