package JavaProgramPractise;


//Operators - Logicals
public class Lab05 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;


        System.out.println( "---------------OR Operatpr --------------");
// OR Operator
        System.out.println(a > b || b > a);
        // false || true =  true

        System.out.println(a > b || b < a);
        // false || false  = false

        System.out.println(a < b || b > a);
        // true ||  true = true

        System.out.println(a < b || b < a);
        // true || false = true


        System.out.println("--------------And Operator --------------------");
// And Operator

        System.out.println(a > b && b > a);
        // false && true =  false

        System.out.println(a > b && b < a);
        // false && false  = false

        System.out.println(a < b && b > a);
        // true &&  true = true

        System.out.println(a < b && b < a);
        // true && false = false



    }

}
