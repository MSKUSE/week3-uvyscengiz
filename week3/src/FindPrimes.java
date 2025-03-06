

public class FindPrimes {

    public static void main(String[] args) {
        int maxPrime = Integer.parseInt(args[0]);

        for (int i = 2; i <= maxPrime; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= ((int) Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }
    }
}
