
import java.util.Scanner;

 class Calculator {

    
    double add(double a, double b) {
        return a + b;
    }

    
    double sub(double a, double b) {
        return a - b;
    }

    
    double mul(double a, double b) {
        return a * b;
    }

    
    double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
}


public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n ");
        int op = sc.nextInt();

        double result;

        switch (op) {
            case 1:
                result = calc.add(num1, num2);
                break;

            case 2:
                result = calc.sub(num1, num2);
                break;

            case 3:
                result = calc.mul(num1, num2);
                break;

            case 4:
                result = calc.div(num1, num2);
                break;

            default:
                System.out.println("Invalid operation");
                sc.close();
                return;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}



public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice;

        do {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.print("Choose operation:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n ");
            int op = sc.nextInt();

            double result = 0;

            switch (op) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.sub(num1, num2);
                    break;
                case 3:
                    result = calc.mul(num1, num2);
                    break;
                case 4:
                    result = calc.div(num1, num2);
                    break;
            }

            System.out.println(result);
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
