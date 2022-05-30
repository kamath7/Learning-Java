public class SIBTest {
    public static final String lale1;

    static {
        lale1  = "Kams";
        System.out.println("SIB Test static initilisation block test");
    }

    public SIBTest() {
        System.out.println("Constructor called");
    }
    static {
        System.out.println("2nd initilisation blockhole");
    }
    public void someMethod(){
        System.out.println("someMethod called");
    }
}
