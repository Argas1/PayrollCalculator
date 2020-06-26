public class Test {
    public static void main(String[] args) {
        Employee mateusz = new Employee("Mateusz", "Argasinski", 4000);



        double nettoYearPayment = PaymentCalculator.nettoYearPayment(mateusz);
        double bruttoYearPayment =PaymentCalculator.bruttoYearPaymentbruttoYearPayment(mateusz);

        System.out.println("Roczna pensja netto Mateusza wynosi : " + nettoYearPayment);
        System.out.println("Roczna pensja brutto Mateusza wynosi : " + bruttoYearPayment);


    }

}
