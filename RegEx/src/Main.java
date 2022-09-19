public class Main {
    public static void main(String[] args) {
        String someString = "The wonderful part of strings are they are strings";
        System.out.println(someString);
        String someString2 = someString.replace("The","OO");
        System.out.println(someString2);

        String alphaNum = "abcDeeefk1993kkalo";
        System.out.println(alphaNum.replaceAll("a","ewesome"));
    }
}