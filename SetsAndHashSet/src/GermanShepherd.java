public class GermanShepherd extends  Dog{

    public GermanShepherd(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.getName().equals(objName);
        }

        return false;
    }
}
