package Lab_03;

public class CreditAccount extends BankAccount {

    private int months;

    public CreditAccount(double amount, double interest, int months) {
        super(amount, interest);
        this.months = months;
    }


    @Override
    public double pay() {

        double newAmount = getAmount();

        for (int i = 0; i < months; i++) {
            newAmount += newAmount * (getInterest() / 100);
        }
    return newAmount;
    }
}
