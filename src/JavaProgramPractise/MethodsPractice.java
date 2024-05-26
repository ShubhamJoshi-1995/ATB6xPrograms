package JavaProgramPractise;

import java.sql.SQLOutput;

public class MethodsPractice {
    public static void main(String[] args) {


        M1();
        M2("shubham");
        int addResult = M3(10,20);
        System.out.println(addResult);

        int resut = M4();
        System.out.println(resut);


    }

   static void M1() {
        System.out.println("Method Without Parameters and Without Return");
    }

    static void M2(String name) {
        System.out.println("Method With Parameters but Without Return" + " " + name);

    }

   static int M3(int a , int b ){
       System.out.println( "Method With Parameters but Also With Return"  );
       return  a+b;
    }

    static int M4(){
        System.out.println("Method Without Parameters but With Return"  );
        return  10 ;
    }
}
