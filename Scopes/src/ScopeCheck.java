public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println(" Public Var "+publicVar+" privaeVar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public  void timesTwo(){
        int privateVar = 2;
        for(int i = 0 ; i< 10; i++){
            System.out.println(i * privateVar);
        }
    }

    public class InnerClass{

        //this.privateVar will fail but ScopeCheck.this.privateVar will pass
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("From inner class "+ScopeCheck.this.privateVar);
        }

        public  void timesTwo(){
            int privateVar = 2;
            for(int i = 0 ; i< 10; i++){
                System.out.println(i * privateVar);
            }
        }
    }
}
