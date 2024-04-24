package JavaProgramPractise;


//Assignment Max between 3 Numbers with ? operators.
public class Assignment01 {
    public static void main(String[] args) {
        int a = 5000;
        int b = 200;
        int c = 100;
        int max;


        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);



    }


}
