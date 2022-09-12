public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized  void sayHello(PolitePerson person){
            System.out.format("%s: %s"+ " has waved!\n", this.name, person.getName());
        }

        public synchronized  void helloBack(PolitePerson person){
            System.out.format("%s: %s"+ " has waved back!\n", this.name, person.getName());
        }
    }

}