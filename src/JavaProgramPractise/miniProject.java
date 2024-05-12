package JavaProgramPractise;

public class miniProject {
    public static void main(String[] args) {

        Courses c1 = new Courses();

        System.out.println("=========Course Details =============================");
        c1.course_Name = "ATB6X JOB Ready Automation";
        c1.course_Duration = 6;
        c1.course_Author_Name = "Pramod Datta";
        c1.course_Amount = 10000;
        c1.course_StartDate=1  ;
        c1.course_EndDate= 6;




        System.out.println("Course Name is " + c1.course_Name);
        System.out.println("Course Duration is " + c1.course_Duration +  " Months");
        System.out.println("Course Authorname is " + c1.course_Author_Name);
        System.out.println("Course Amount is " + c1.course_Amount);
        System.out.println("Cousre Start Date on " +c1.course_StartDate + " April 2024");
        System.out.println("Course End Date on " + c1.course_EndDate +  " November 2024 ") ;


        c1.course_Enrollment();


        Student s1 = new Student();

        System.out.println(" =========Student Details =============================");
        s1.student_Name = "Shubham Joshi";
        s1.student_phone = 987654321;
        s1.student_email = "shub.joshi28@gmail.com";
        s1.student_exp = 6;
        s1.student_id = 9011;


        System.out.println("Student Name is " + s1.student_Name);
        System.out.println("Student Phone is " + s1.student_phone);
        System.out.println("Student Email is  " + s1.student_email);
        System.out.println("Student Id is " + s1.student_id);
        System.out.println("Student Exp " + s1.student_exp);

        s1.AlreadyEnrollstudent();
        s1.NewEnrollmentstudent();
        s1.Aluministudent();


        Payment p1 = new Payment();

        System.out.println("=========Payment Details =============================");
        p1.payment_mode = "emi";
        p1.payment_transactionid = "123XXX456XXX789";


        System.out.println("Payment Amount is " + p1.payment_Amount);
        System.out.println("Payment Mode is " + p1.payment_mode);
        System.out.println("Payment Id " + p1.payment_transactionid);
        p1.paymentComplete();
        p1.paymentDueDate();
        p1.paymentPending();


    }
}
