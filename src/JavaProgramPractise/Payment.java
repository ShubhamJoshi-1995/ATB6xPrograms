package JavaProgramPractise;

public class Payment {

    String payment_mode;
    String payment_transactionid;
    int payment_Amount = 10000;


    void paymentPending() {
        System.out.println("Payment Pending of 2000 Rs");

    }

    void paymentComplete() {

        System.out.println("Full Payement Complete ");

    }

    void paymentDueDate() {
        System.out.println("Payment DueDate On June 1st 2024  ");
    }


}
