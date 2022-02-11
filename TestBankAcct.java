public class TestBankAcct {
    public static void main(String[] args) {
        BankAcct newBankAcct1 = new BankAcct();

        newBankAcct1.depositChecking(200);
        newBankAcct1.depositSavings(300);
        newBankAcct1.withdrawSavings(100);
        System.out.println(newBankAcct1.displayTotalBankMoney());
    }
}
