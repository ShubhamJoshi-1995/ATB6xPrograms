package JavaProgramPractise;


import java.util.Scanner;

//Positive and Negative Number
public class Assignment05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        if (n1>0){
            System.out.println("Entered Number is Positive Number " +n1);
        } else if (n1<0) {
            System.out.println("Entered Number is Negative Number "+n1);

        }

sc.close();
    }
}
