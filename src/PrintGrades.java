import java.util.Scanner;

public class PrintGrades {
    public static void main(String[]args){
        String nextGrade = "Y";
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter your current grade: ");
        int myGrade = keybd.nextInt();


        while (nextGrade != "N"){
            System.out.print("Please enter your next grade: ");
            myGrade = keybd.nextInt();
            keybd.nextLine();

            if (myGrade >= 97){
                System.out.println("Your grade is A+");
            } else if (myGrade >= 94 && myGrade >= 96 ) {
                System.out.println("Your grade is A");
            } else if (myGrade >= 90 && myGrade >= 93 ) {
                System.out.println("Your grade is A-");
            } else if (myGrade >= 87 && myGrade >= 89 ) {
                System.out.println("Your grade is B+");
            } else if (myGrade >= 84 && myGrade >= 86 ) {
                System.out.println("Your grade is B");
            } else if (myGrade >= 80 && myGrade >= 83 ) {
                System.out.println("Your grade is B_");
            } else if (myGrade >= 77 && myGrade >= 79 ) {
                System.out.println("Your grade is C+");
            } else if (myGrade >= 74 && myGrade >= 76 ) {
                System.out.println("Your grade is C");
            } else if (myGrade >= 70 && myGrade >= 73 ) {
                System.out.println("Your grade is C-");
            } else if (myGrade >= 60 && myGrade >= 69 ) {
                System.out.println("Your grade is D");
            } else if (myGrade < 60){
                System.out.println("I'm sorry, you failed the class.");
            } else {
                nextGrade.equals("N");
                System.out.println("You have entered all grades. Thank you. ");
            }
            System.out.print("Would you like to enter another grade? (Y/N): ");
            nextGrade = keybd.nextLine();

        }


    }
}
