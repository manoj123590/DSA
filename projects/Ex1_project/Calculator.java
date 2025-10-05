package projects.Ex1_project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from the user till the user does not press 'x' or 'X'
        while (true) {
            // Take the operator as input
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '+' || op == '-' || op == '*' || op == '/'  ) {
                // input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    System.out.println(num1 + num2);
                } else if (op == '-') {
                    System.out.println(num1 - num2);
                } else if (op == '*') {
                    System.out.println(num1 * num2);
                } else {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Invalid input");
                    }
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }

        }
        in.close();
    }

}
