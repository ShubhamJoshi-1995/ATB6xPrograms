package JavaProgramPractise;

public class Assignment12 {
    public static void main(String[] args) {
        int[] array = {1,2, 3};
        int[] newArray = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            newArray[i] = array[i]*2;
        }

        for (int i = 0; i < newArray.length ; i++) {
            System.out.println(newArray[i]);
        }


    }
}




