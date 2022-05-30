public class Main {

    public static int catalyst = 69;
    public static void main(String[] args) {

        StaticTst staticTst = new StaticTst("Joker");
        System.out.println(staticTst.getName()+". Instance num - "+StaticTst.getNumInstances());

        StaticTst staticTst1 = new StaticTst("Gateshead");
        System.out.println(staticTst1.getName()+". Instance num - "+StaticTst.getNumInstances());

        int ans = catalyse(69); //won't work without the static keyword in catalyse method
        System.out.println(ans);

    }

    public static int catalyse(int num){
        return num * catalyst;
    }
}