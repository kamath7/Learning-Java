public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar1 = 1;

    public ScopeCheck() {
        System.out.println(" Public Var "+publicVar+" privaeVar = "+ privateVar1);
    }

    public int getPrivateVar1() {
        return privateVar1;
    }

    public  void timesTwo(){
        int privateVar = 2;
        for(int i = 0 ; i< 10; i++){
            System.out.println(i * privateVar);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("Using var3 "+innerClass.privateVar3);
    }
    public class InnerClass{

        //this.privateVar will fail but ScopeCheck.this.privateVar will pass
        private int privateVar3 = 3;

        public InnerClass() {
            System.out.println("From inner class "+ScopeCheck.this.privateVar1);
        }

        public  void timesTwo(){
            int privateVar3 = 2;
            for(int i = 0 ; i< 10; i++){
                System.out.println(i * privateVar3);
            }
        }
    }
}
