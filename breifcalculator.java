import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("____the menu of our calculator____");
        int operator, n1, n2;
        double result;
           do{
         System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Power");
        System.out.println("6: Sqrt");
        System.out.println("7: Factorial");
        System.out.println("8: Quit");
        System.out.print("Choose an operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

            



        switch (operator) {
            case 1:
               
                System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                System.out.print("Enter the second number :");
                n2 = sc.nextInt();
         
                result = add(n1, n2);
                System.out.println("The sum is: " + result);
                break;
		  case 2:

                System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                System.out.print("Enter the second number :");
                n2 = sc.nextInt();
                result = subtract(n1, n2);
                System.out.println("The difference is: " + result);
                break;
		  case 3:
		    System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                System.out.print("Enter the second number :");
                n2 = sc.nextInt();
                result = multiply(n1, n2);
                System.out.println("The product is: " + result);
                break;
		   case 4:
		     System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                System.out.print("Enter the second number :");
                n2 = sc.nextInt();
                if (n2 != 0) {
                    result = divide(n1, n2);
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
		  case 5:
		  System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                System.out.print("Enter the second number :");
                n2 = sc.nextInt();
                result = power(n1, n2);
                System.out.println("The power is: " + result);
                break;
		    case 6:
		   System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                result = sqrt(n1); // Only need n1
                System.out.println("The square root is: " + result);
                break;
		   case 7:

                System.out.print("Enter the first number :");
                n1 = sc.nextInt();
                result = factorial(n1);
                System.out.println("The factorial is: " + result);
                break;
                default:
                System.out.println("Entered number is not valid");

    }
            }while (operator !=8 );
    }
// Add two numbers
    static int add(int n1, int n2) {
        return n1 + n2;
	    }
       // Subtract two numbers
    static int subtract(int n1, int n2) {
        return n1 - n2;
    }
       // Multiply two numbers
    static int multiply(int n1, int n2) {
        return n1 * n2;
    }
        // Divide two numbers
    static double divide(int n1, int n2) {
        return (double) n1 / n2; // Return a double for division
    }
       // Calculate power (n1 raised to the power of n2)
    static double power(int n1, int n2) {
        return Math.pow(n1, n2); // Using Math.pow for power calculation
    }
      // Calculate the square root of a number
    static double sqrt(int n1) {
        return Math.sqrt(n1); // just one number for square root
    }
// Calculate the factorial of a number
    static int factorial(int n1) {
        int result = 1;
        for (int i = 1; i <= n1; i++) {
            result *= i;
        }
        return result;
    }
}



