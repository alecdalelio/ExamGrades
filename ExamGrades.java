import java.util.Scanner;

/**
 * ExamGrades
 */
public class ExamGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What did you score on the test?");
        int score = input.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your grade is: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Your grade is: D");
        } else if (score >= 50 && score < 60) {
            System.out.println("Your grade is: F");
        }

        switch (score) {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90:
                if (score > 95) {
                    System.out.println("WOW GREAT JOB");
                }
                System.out.println("Your grade is: A");
                break;

            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                System.out.println("Your grade is: B");
                break;

            case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70:
                System.out.println("Your grade is: C");
                break;

            case 69, 68, 67, 66, 65, 64, 63, 62, 61, 60:
                System.out.println("Your grade is: D");
                break;

            case 59, 58, 57, 56, 55, 54, 53, 52, 51, 50:
                System.out.println("Your grade is: F");
                break;

            default:
                System.out.println("Your grade is not available");
                break;
        }
    }
}