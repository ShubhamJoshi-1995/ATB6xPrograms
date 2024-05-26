package JavaProgramPractise.Inheritance;

public class RunnerClass {
    public static void main(String[] args) {


        // When Parent Object Created it only take Parent Attributes and Behaviours

        P1 parent = new P1();
        //parent.printDetails();

        //But when You extend Parent and Create Object of Child it access Both Parent and child attributes and Behaviours
        C1 child = new C1();
        child.printDetails();


    }
}
