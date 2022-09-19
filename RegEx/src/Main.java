public class Main {
    public static void main(String[] args) {
        String someString = "The wonderful part of strings are they are strings";
        System.out.println(someString);
        String someString2 = someString.replace("The","OO");
        System.out.println(someString2);

        String alphaNum = "abcDeeefk1993kkalo";
        System.out.println(alphaNum.replaceAll("a","ewesome"));

        System.out.println(alphaNum.replaceAll("^abc","OorLalle"));

        String alphaNum2 = "abcDeeefk1993abcDeeekkalo";
        System.out.println(alphaNum2.replaceAll("^abc","OorLalle")); //only matches start of string

        System.out.println(alphaNum.matches("^hello")); //false
        System.out.println(alphaNum.matches("^abc")); //false

        System.out.println(alphaNum.replaceAll("kalo$","TheEnd")); //end

        System.out.println(alphaNum.replaceAll("[aei]", "X"));

    }
}