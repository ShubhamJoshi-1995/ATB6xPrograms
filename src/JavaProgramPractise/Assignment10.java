package JavaProgramPractise;


import java.util.Scanner;

//Switch for arth
public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input1 ");
        int input1 = sc.nextInt();
        System.out.println("Enter Input2 ");
        int input2 = sc.nextInt();


        System.out.println("Enter Operator +-*%/");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result :" + (input1 + input2));
                break;
            case '-':
                System.out.println("Result :" + (input1 - input2));
                break;
            case '*':
                System.out.println("Result : " + (input1 * input2));
                break;
            case '%':
                System.out.println("Result:" + (input1 % input2));
                break;
            case '/':
                System.out.println("Result:" + (input1 / input2));
                break;
            default:
                System.out.println("Invalid Operator");

        }
        sc.close();
    }
}
