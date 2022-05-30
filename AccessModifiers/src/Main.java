public class Main {
    public static void main(String[] args) {

        Account account = new Account("John Doe");
        account.deposit(1000);
        account.withdrawal(690);
        account.withdrawal(200);
        account.deposit(100);
        account.withdrawal(1000);
        account.calculateBalance();

//        account.transaction.add(4000); //shouldn't be allowed
        System.out.println("Balance -> "+account.getBalance());
    }
}