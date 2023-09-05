package Lab_02;

public class Company_ET extends Company {

    public Company_ET(String name, String date, String code, String ownerName, double startingFund, double currentFund) {
        super(name, date, code);
        this.ownerName = ownerName;
        this.startingFund = startingFund;
        this.currentFund = currentFund;

    }

    private String ownerName;
    private double startingFund;
    private double currentFund;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public double getStartingFund() {
        return startingFund;
    }

    public void setStartingFund(double startingFund) {
        this.startingFund = startingFund;
    }


    public double getCurrentFund() {
        return currentFund;
    }

    public void setCurrentFund(double currentFund) {
        this.currentFund = currentFund;
    }

    public double currentProfit() {
        return this.currentFund - this.startingFund;
    }

    public static void main(String[] args) {
        Company_ET company1 = new Company_ET("Coca-Cola", "12.04.1996", "523", "John", 1000, 1500);
        System.out.println(company1.currentProfit());
    }
}

