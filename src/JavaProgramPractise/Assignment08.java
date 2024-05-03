package JavaProgramPractise;


import java.util.Scanner;

//Leap year program
public class Assignment08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int yr =  sc.nextInt();

        if ((yr%4==0 && yr%100!=0 )|| (yr%400==0)){
            System.out.println("Yr Enter is Leap Year ");
        }else {
            System.out.println("Yr is Not a Leap Year ");
        }

        sc.close();

    }
}
