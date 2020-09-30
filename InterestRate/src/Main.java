public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(1000, (double) i));
        }

//        reversed

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(1000, (double) i));
        }
    }

        public static double calculateInterest( double amount, double interestRate) {
            return (amount * (interestRate / 100));
        }
    }

