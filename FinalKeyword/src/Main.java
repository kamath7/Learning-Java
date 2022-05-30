public class Main {
    public static void main(String[] args) {
        LalelClass lalelClass = new LalelClass("Deathshead");
        LalelClass lalelClass1 = new LalelClass("Rorke");
        LalelClass lalelClass2 = new LalelClass("Shepherd");

        System.out.println(lalelClass.getInstance_no());

        System.out.println(Math.PI);
//      Math m = new Math(); - won't happen. constructor is marked private since you shouldn't be creating instances of this class


        EliteClass eliteClass  = new EliteClass(123450);
        eliteClass.storePass();
        int correctPass = 123450;
        int wrongPass = 1239;

        System.out.println(eliteClass.letMeIn(correctPass));
        System.out.println(eliteClass.letMeIn(wrongPass));


    }
}