// lab14

import java.util.Scanner;

class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtraction {
    public int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }
}
class Division {
    public float divide(float a, float b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return a / b;
    }
}


public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter second number:");
        float num2 = scanner.nextFloat();

        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        float result = 0;

        switch (operation) {
            case '+':
                result = new Addition().add((int) num1, (int) num2);
                break;
            case '-':
                result = new Subtraction().subtract((int) num1, (int) num2);
                break;
            case '*':
                result = new Multiplication().multiply((int) num1, (int) num2);
                break;
            case '/':
                result = new Division().divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
        
    }
}
