public class EliteClass {

    private static int key = 2999191;
    private final int lallepass;

    public EliteClass(int password) {
        this.lallepass = edcrypt(password);
    }

    private int edcrypt(int password){
        return password ^ key;
    }

    public void storePass(){
        System.out.println("Stored password as "+this.lallepass);
    }

    public boolean letMeIn(int password){
        if (edcrypt(password) == this.lallepass){
            System.out.println("Welcome DUDE!");
            return true;
        }
        System.out.println("You are not permitted");
        return false;
    }
}
