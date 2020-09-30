public class EvenNumber {

    public static void main(String[] args) {

        int n = 2;
        int lastNumber = 20;

        while (n <= lastNumber) {
            n ++;
            if (!isEvenNumber(n)) {
                continue;
            }

            System.out.println("Even Number " + n);
        }
    }

    public static boolean isEvenNumber(int n) {

        if(n % 2 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
