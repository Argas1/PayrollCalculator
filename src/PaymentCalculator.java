public class PaymentCalculator {

    private final static double MONTHLY_ZUS = 1000;

    public static double nettoYearPayment (Employee employee){
        return 12 * employee.getMonthlySalary();

    }


    public static double bruttoYearPaymentbruttoYearPayment (Employee employee){

        double nettoSalary = employee.getMonthlySalary();
        double bruttoSalary = employee.getMonthlySalary()*0.2;

        return 12*(nettoSalary + bruttoSalary + MONTHLY_ZUS);
    }
}
