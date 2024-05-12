package JavaProgramPractise;


public class Assignment13 {
    public static void main(String[] args) {

        int[] arry = {30, 50, 60, 90, 10, 100, 999};

        int max_salary = Integer.MIN_VALUE;

        for (int i = 0; i < arry.length; i++) {

            if (arry[i] > max_salary) {
                max_salary = arry[i];

            }


        }
        System.out.println("Maximum Number from array is " + max_salary);
    }
}
