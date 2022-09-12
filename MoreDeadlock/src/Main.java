public class Main {
    public static void main(String[] args) {
        final PolitePerson lalle = new PolitePerson("Lalle");
        final PolitePerson lalle2 = new PolitePerson("Lalle2");

        new Thread(new Runnable() {
            @Override
            public void run() {
                lalle.sayHello(lalle2);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lalle2.sayHello(lalle);
            }
        }).start();
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + " has waved!\n", this.name, person.getName());
            person.helloBack(this);
        }

        public synchronized void helloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has waved back!\n", this.name, person.getName());
        }
    }

}