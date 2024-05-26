package JavaProgramPractise.functions;

import java.util.Scanner;

public class CalculatorEx {

    public static void main(String[] args) {

        System.out.println("===========Program Start =============");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2");
        int num2 = sc.nextInt();


        //Calculator
        int radd = Addition(num1, num2);
        System.out.println("Addition :" + radd);

        int rsub = Substraction(num1, num2);
        System.out.println("Subtraction :" + rsub);

        int rmul = Multiplication(num1, num2);
        System.out.println("Multiplication :" + rmul);

        sc.close();

        System.out.println("==============Program End =========");

    }


    static int Addition(int a, int b) {
        return a + b;
    }

    static int Substraction(int a, int b) {
        return a - b;
    }

    static int Multiplication(int a, int b) {
        return a * b;
    }


}
