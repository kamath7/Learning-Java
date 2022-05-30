public class LalelClass {

    private static int classCtr = 0;
    public final int instance_no;
    private final String name;

    public LalelClass(String name) {
        this.name = name;
        classCtr++;
        instance_no = classCtr;//won't work since marked final
        System.out.println(name+" created! Instance num - "+this.instance_no);
    }

    public int getInstance_no() {
        return instance_no;
    }
}
