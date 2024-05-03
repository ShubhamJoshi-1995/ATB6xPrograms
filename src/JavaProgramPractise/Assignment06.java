package JavaProgramPractise;

import java.util.Scanner;

//Largest from 3 Number with if Else
public class Assignment06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 ");
        int n1 = sc.nextInt();

        System.out.println("Enter n2");
        int n2 = sc.nextInt();

        System.out.println("Enter n3");
        int n3 = sc.nextInt();


        if (n1 > n2 && n1 > n3  ) {
            System.out.println("Largest Number " + n1);
        } else if (n2 > n1  && n2 > n3 ) {
            System.out.println("Largest Number " + n2);
        }else
        {
            System.out.println("Largest Number "+ n3);
        }
        sc.close();

    }

}

