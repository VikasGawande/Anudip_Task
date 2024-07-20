package anu.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Calcu_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        char choice;
        double num1, num2;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. View History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    history.add(num1 + " + " + num2 + " = " + sum);
                    System.out.println("Result: " + sum);
                    break;
                case '2':
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    double difference = num1 - num2;
                    history.add(num1 + " - " + num2 + " = " + difference);
                    System.out.println("Result: " + difference);
                    break;
                case '3':
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    double product = num1 * num2;
                    history.add(num1 + " * " + num2 + " = " + product);
                    System.out.println("Result: " + product);
                    break;
                case '4':
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        double division = num1 / num2;
                        history.add(num1 + " / " + num2 + " = " + division);
                        System.out.println("Result: " + division);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case '5':
                    System.out.println("History of Operations:");
                    for (String entry : history) {
                        System.out.println(entry);
                    }
                    break;
                case '6':
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != '6');

        scanner.close();
    }
}
