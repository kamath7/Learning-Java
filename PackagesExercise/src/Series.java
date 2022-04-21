public class Series {

    public long sum(int n){
     return (n * (n+1))/2;
    }

    public long factorial (int n){
        long fact = 1;
        if (n == 0){
            return 1;
        }
        for (int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }

    public int fibonacci(int n){
        if (n == 0 ){
            return 0;
        }
       else if (n == 1){
            return 1;
        } else{
            return fibonacci(n) + fibonacci(n-1);
        }
    }
}
