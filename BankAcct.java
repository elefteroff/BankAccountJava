public class BankAcct {
    private double checkingBal;
    private double savingsBal;
    private static int numOfAccts = 0;
    private static double totalBankMoney = 0.0;

    // CONSTRUCTOR:

    public double BankAcct(double checkingBal, double savingsBal) {
        this.checkingBal = 0.0;
        this.savingsBal = 0.0;
        numOfAccts++;
        return numOfAccts;
    }

    // METHODS:

    public double depositChecking(double checkingDeposit){
        setCheckingBal(getCheckingBal() + checkingDeposit);
        totalBankMoney += checkingDeposit;
        return totalBankMoney;
    }

    public double depositSavings(double savingsDeposit){
        setSavingsBal(getSavingsBal() + savingsDeposit);
        totalBankMoney += savingsDeposit;
        return totalBankMoney;
    }

    public double withdrawChecking(double checkingWithdraw){
        if(checkingWithdraw <= totalBankMoney){
        setCheckingBal(getCheckingBal() - checkingWithdraw);
        totalBankMoney -= checkingWithdraw;
        } else {
            System.out.println("Insufficient funds. Cannot make withdrawal in the amount of " + checkingWithdraw);
        } return totalBankMoney;
    }

    public double withdrawSavings(double savingsWithdraw){
        if(savingsWithdraw <= totalBankMoney){
        setSavingsBal(getSavingsBal() - savingsWithdraw);
        totalBankMoney -= savingsWithdraw;
        } else {
            System.out.println("Insufficient funds. Cannot make withdrawal in the amount of " + savingsWithdraw);
        } return totalBankMoney;
    }

    public double displayTotalBankMoney() {
        totalBankMoney = getCheckingBal() + getSavingsBal();
        return totalBankMoney;
    }

    // GETTERS AND SETTERS:

    public double getCheckingBal() {
        return this.checkingBal;
    }

    public void setCheckingBal(double checkingAmt) {
        this.checkingBal = checkingAmt;
    }

    public double getSavingsBal() {
        return this.savingsBal;
    }

    public void setSavingsBal(double savingsAmt) {
        this.savingsBal = savingsAmt;
    }
}