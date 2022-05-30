public class StaticTst {
    private static int numInstances = 0;
    private String name;

    public StaticTst(String name) {
        this.name = name;
        numInstances++;
    }

    public static  int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

}
