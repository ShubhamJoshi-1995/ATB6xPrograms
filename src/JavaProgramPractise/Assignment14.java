package JavaProgramPractise;

public class Assignment14 {

    public static void main(String[] args) {


        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        int max_Value = Integer.MIN_VALUE;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( array[i][j]>max_Value);
                max_Value = array[i][j];

            }

        }
        System.out.println(max_Value);
    }




}
