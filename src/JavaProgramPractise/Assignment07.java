package JavaProgramPractise;


import java.util.Scanner;

//Vowel
public class Assignment07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Enter Value is Vowel " + ch);
        }else {
            System.out.println("Enter Value is Constant " + ch);
        }

    }
}
