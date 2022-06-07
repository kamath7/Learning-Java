public class AnotherMain {
    public static void main(String[] args) {
        GermanShepherd karadi = new GermanShepherd("Karadi");
        Dog anotherKaradi = new Dog("Karadi");
        System.out.println(anotherKaradi.equals(karadi));
        System.out.println(karadi.equals(anotherKaradi));
    }
}
