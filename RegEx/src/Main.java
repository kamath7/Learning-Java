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
        System.out.println(alphaNum.replaceAll("[aei]", "Replacing a letter"));
        System.out.println(alphaNum2.replaceAll("[aei][fj]","x"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        String someText = "abbcbe,123213mmaskksaid";

        System.out.println(someText.replaceAll("[^aj]", "X")); //matches all characters that are not aj
        System.out.println(someText.replaceAll("[abcdef345678]","X"));
        System.out.println(someText.replaceAll("[a-f3-8]", "X"));
        System.out.println(someText.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(someText.replaceAll("[0-9]","X"));
        System.out.println(someText.replaceAll("\\d","X"));
        System.out.println(someString.replaceAll("\\D","X"));

        String someWhiteSpace = "Blanks and Tabs \t and everything else \n";
        System.out.println(someWhiteSpace);
        System.out.println(someWhiteSpace.replaceAll("\\s",""));
        System.out.println(someWhiteSpace.replaceAll("\\S",""));
        System.out.println(someWhiteSpace.replaceAll("\\w", "sk"));
        System.out.println(someWhiteSpace.replaceAll("\\b", "X")); //covers first and last char

        String alnum = "ansofnaosinaocnaosnc1098212094810294..as";
        System.out.println(alnum.replaceAll("^anso","YYY"));
        System.out.println(alnum.replaceAll("^an{3}","YYY"));
        System.out.println(alnum.replaceAll("^ansof+","YYY"));
        System.out.println(alnum.replaceAll("^anso*", "YYY"));

    }
}