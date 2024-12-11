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
                default:
                System.out.println("Entered number is not valid");

    }
            }while (operator !=1 );
    }
// Add two numbers
    static int add(int n1, int n2) {
        return n1 + n2;
    }
}

