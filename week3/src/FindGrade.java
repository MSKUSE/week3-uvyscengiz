
public class FindGrade {

    public static void main(String[] args) {

        if (args.length <= 0) {
            System.out.println("You should give a score!!!");
        } else {
            int grade = Integer.parseInt(args[0]);

            if (grade >= 90) {
                System.out.println("Grade : A");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("Grade : B");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("Grade : C");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("Grade : D");
            } else if (grade >= 0 && grade <= 59) {
                System.out.println("Grade : F");
            } else {
                System.out.println("Invalid Grade");
            }
        }

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F
    }

}
