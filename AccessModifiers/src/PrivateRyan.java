public class PrivateRyan implements Accesser{
    @Override
    public void methodA() {
        System.out.println(cons);
    }

    @Override
    public void methodB() {

    }

    @Override
    public boolean methodC() {
        return false;
    }
//can't have private class at the top level
}
