package JavaProgramPractise;

public class Person1 {


    String name ;
    long phn;
    String  email;




    Person1(){
        System.out.println("Default Constructor");
    }

    Person1(String Givenname , long phone, String eid){
        this.name = Givenname;
        this.phn=phone;
        this.email=eid;
        System.out.println("Parameters Constructor");

    }

    void printDetails(){
        System.out.println("Person name  " + name);
        System.out.println("Person id "  +email);
        System.out.println("Person phn " + phn);
    }

}
