package JavaProgramPractise;

public class Lab08 {
    public static void main(String[] args) {
        String str1 =  "Shubham Joshi";

        String str2 = new String("Shubham Joshi");
        String str3 = "Shubham Joshi ABCD";


        if (str1==str1 && str1 ==str3){
            System.out.println("String 1 ==  String 2");

        } else if (str1.equalsIgnoreCase(str2) || str1 .equalsIgnoreCase(str3)) {
            System.out.println("str1 equal to str2  ");

        } else {

            System.out.println("Invalid Input str1 and str2 ");

        }

    }
}
