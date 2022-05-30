public class StaticTst {
    private int numInstances = 0;
    private String name;

    public StaticTst(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

}
