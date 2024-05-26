package JavaProgramPractise;

import java.util.Locale;
import java.util.Scanner;

public class PracticeEx {
    public static void main(String[] args) {

        System.out.println("Enter String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase(Locale.ROOT);
        System.out.println(str);

    }
}
