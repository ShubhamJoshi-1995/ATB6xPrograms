package JavaProgramPractise.Inheritance;

public class P1 {
    //Student Class


    String sName;
    int sid;

    public P1(String sName, int sid, String sEmail, long sPhone) {
        this.sName = sName;
        this.sid = sid;
        this.sEmail = sEmail;
        this.sPhone = sPhone;
    }

    String sEmail;
    long sPhone;

    public P1() {
        System.out.println("dc");
    }


    void printDetails() {
        System.out.println("Student Name :" + sName);
        System.out.println("Student Id :" + sid);
        System.out.println("Student Email id  :" + sEmail);
        System.out.println("Student Phone Number  :" + sPhone);

    }


}
