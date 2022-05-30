public class ExtendedEliteClass extends EliteClass{
    private int decryptedPass;

    public ExtendedEliteClass(int password) {
        super(password);
        this.decryptedPass = password;
    }

//    @Override
//    public void storePass() {
//        System.out.println("saving pass as "+this.decryptedPass);
//    } - to avoid overriding
}
