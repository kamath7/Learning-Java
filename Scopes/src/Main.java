public class Main {
    public static void main(String[] args) {

        String privateVar = "this is private";

        ScopeCheck check = new ScopeCheck();
        System.out.println("privateVar inside scopeCheck is "+check.getPrivateVar());
        System.out.println(privateVar);

        ScopeCheck.InnerClass innerClass = check.new InnerClass();

        innerClass.timesTwo();
    }

}