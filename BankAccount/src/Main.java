public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(50);
        account.withdraw(100);

        account.withdraw(20);
        account.deposit(500);
    }
}
