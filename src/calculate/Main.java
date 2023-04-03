package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer= "N";
        do {
            System.out.print("Enter first number : ");
            int num = scanner.nextInt();

            System.out.print("Enter second number : ");
            int num1 = scanner.nextInt();


            System.out.print("Please enter one of symbol +,-,*, / :");
            char symbol = scanner.next().charAt(0);


            Calculator calculator = new Calculator();
            calculator.calculateResult(num, num1, symbol);

            System.out.println("Would you like to do more calculation " +
                    "Please enter “Y” or “N” :");
             answer = scanner.next();
        } while(answer.equalsIgnoreCase("Y") );
        // closing scanner object
        scanner.close();
    }
}






