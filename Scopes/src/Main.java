public class Main {
    public static void main(String[] args) {

        String privateVar = "this is private";

        ScopeCheck check = new ScopeCheck();
        System.out.println("privateVar inside scopeCheck is "+check.getPrivateVar1());
        System.out.println(privateVar);

        ScopeCheck.InnerClass innerClass = check.new InnerClass();

        innerClass.timesTwo();
        check.useInner();
//        innerClass.privateVar3; - Not accessible

    }

}