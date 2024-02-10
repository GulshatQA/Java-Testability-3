public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loanAmount = 1_500_000;
        int loanTerm = 18;
        double rateOfInterest = 10.7;

        int monthPayment = service.calculate(loanAmount, loanTerm, rateOfInterest); // должно получиться 90569 руб.
        System.out.println("Ежемесячный платёж: " + monthPayment);

    }
}