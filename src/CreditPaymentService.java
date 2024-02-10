public class CreditPaymentService {

    public int calculate(int loanAmount, int loanTerm, double rateOfInterest) {
        double ratePerMonth = rateOfInterest / (100 * 12); // процентная ставка в месяц
        double annuityRate = ratePerMonth * (Math.pow(1 + ratePerMonth, 18)) / ((Math.pow(1 + ratePerMonth, 18) - 1)); // коэффициент аннуитета

        double monthlyPayment = loanAmount * annuityRate; // ежемесячный платёж
        return (int) monthlyPayment;
    }
}
