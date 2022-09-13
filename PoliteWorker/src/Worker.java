public class Worker {

    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public  synchronized  void work(SharedResource sharedResource, Worker myWorker){
        while(active){
            if (sharedResource.getOwner() !=this){
                try{
                    wait(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                continue;
            }

            if (myWorker.isActive()){
                System.out.println(getName() + ": gave resources to the worker" + myWorker.getName());
                sharedResource.setOwner(myWorker);
                continue;
            }
            System.out.println(getName()+ " working on common resource");
            active = false;
            sharedResource.setOwner(myWorker);
        }
    }
}
