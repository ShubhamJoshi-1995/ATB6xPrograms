package JavaProgramPractise.functions;

import java.sql.SQLOutput;

public class Lab01 {
    public static void main(String[] args) {

        System.out.println("=====================Program Starts========================");

        //No Return No Parameters
        SayHi();

        // No Return With Parameters
        SayName("shubham");

        // Return No Parameters
        int r1 = SumofTwoNumber();
        System.out.println("Return with No Parameters :" + r1);

        // Retutn With Parameters

        int r2 = SumofTwoNumber(20, 40);
        System.out.println("Return with parameter : " + r2);


        System.out.println("===================Program Ends========================");
    }


    static void SayHi() {
        System.out.println("Hello");
    }


    static void SayName(String name) {
        System.out.println("Hello , " + name);
    }

    static int SumofTwoNumber() {
        return 5 + 6;
    }

    static int SumofTwoNumber(int a, int b) {
        return a + b;

    }


}
