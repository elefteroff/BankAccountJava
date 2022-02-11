public class TestBankAcct {
    public static void main(String[] args) {
        BankAcct newBankAcct1 = new BankAcct(10.00, 20.00);

        newBankAcct1.depositChecking(200.00);
        newBankAcct1.depositSavings(300.00);
        newBankAcct1.withdrawSavings(100.00);
        System.out.println(newBankAcct1.displayTotalBankMoney());
    }
}
