

package comprog;

import java.util.Scanner;

public class Comprog {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean playagain = true;
        
        
        while(playagain) {
            
            int score = 0;
            
            
            System.out.println("\n================================================\n");
            System.out.println("           welcome to quiz bee 102");
            System.out.println("\n================================================\n");
            


            //q1
            System.out.println("1.what types of statement that contrust is followed by a logical expression where data is compared?");
            System.out.println("a.if statement       b.if-else statement");
            System.out.println("c.switch statement   d.break statement");
            System.out.print("\nenter your answer: ");
            String response1 = scanner.next();
            
            if (response1.length() == 1){
                char answer1 = scanner.next().charAt(0);
                if (answer1 == 'a' || answer1 == 'A') {
                    System.out.println("\nyou are correct!\n");
                    score += 1;
                }
            }
            else {
                System.out.println("\nyou are wrong!");
                System.out.println("the correct answer is A.\n");
            }
            

            //Q2
            System.out.println("2.what are used to control the execution flow of the program?");
            System.out.println("a.control statement       b.switch statement");
            System.out.println("c.selection statement     d.if statement");
            System.out.print("\nenter your answer: ");
            String response2 = scanner.next();
            
            if (response2.length() == 1){
                char answer2 = scanner.next().charAt(0);
                if (answer2 == 'a' || answer2 == 'A') {
                    System.out.println("\nyou are correct!\n");
                    score += 1;
                }
            }
            else {
                System.out.println("\nyou are wrong!");
                System.out.println("the correct answer is A.\n");
            }


            //Q3
            System.out.println("3.this decision-making statements that include if, if-else, and switch statment?");
            System.out.println("a.switch statement       b.break statement");
            System.out.println("c.selection statement    d.if statement");
            System.out.print("\nenter your answer: ");
            String response3 = scanner.next();
            
            if (response3.length() == 1){
                char answer3 = scanner.next().charAt(0);
                if (answer3 == 'c' || answer3 == 'C') {
                    System.out.println("\nyou are correct!\n");
                    score += 1;
                }
            }
            else {
                System.out.println("\nyou are wrong!");
                System.out.println("the correct answer is C.\n");
            }


            //Q4
            System.out.println("4.this looping statement that include while, do while, and for statment?");
            System.out.println("a.selection statement       b.repetition statement");
            System.out.println("c.branching statement       d.while-loop statement");
            System.out.print("\nenter your answer: ");
            String response4 = scanner.next();
            
            if (response4.length() == 1){
                char answer4 = scanner.next().charAt(0);
                if (answer4 == 'b' || answer4 == 'B') {
                    System.out.println("\nyou are correct!\n");
                    score += 1;
                }
            }
            else {
                System.out.println("\nyou are wrong!");
                System.out.println("the correct answer is B.\n");
            }


            //Q5
            System.out.println("5.a looping statement that lists the condition after the statement to be executed?");
            System.out.println("a.repetition statement       b.do-while loop statement");
            System.out.println("c.branching statement        d.selection statement");
            System.out.print("\nenter your answer: ");
            String response5 = scanner.next();
            
            if (response5.length() == 1){
                char answer5 = scanner.next().charAt(0);
                if (answer5 == 'b' || answer5 == 'B') {
                    System.out.println("\nyou are correct!\n");
                    score += 1;
                }
            }
            else {
                System.out.println("\nyou are wrong!");
                System.out.println("the correct answer is B.\n");
            }
            
            System.out.println("\n================================================\n");
            System.out.println("your final score is " + score + "/5 congrats");
            System.out.println("\n================================================\n");
            
            System.out.println("do you want to take the quiz again?");
            System.out.print("(Y)Yes or (N)No: ");
            char response = scanner.next().charAt(0);

            if (response == 'y' || response == 'Y') {
                playagain = true;
            }
            else {
                playagain = false;
                System.out.println("\n================================================\n");
                System.out.println("           thanks for taking the quiz!");
                System.out.println("\n================================================\n");
            }
        }
        
    }
    
}
