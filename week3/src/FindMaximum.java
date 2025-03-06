
public class FindMaximum {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You should give two numbers!!!");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        boolean condition = num1 > num2;

        int greatest = condition ? num1 : num2;

        System.out.println("Maximum is " + greatest);
    }
}
