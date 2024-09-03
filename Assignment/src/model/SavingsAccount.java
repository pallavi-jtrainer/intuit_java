package model;

public class SavingsAccount implements Account{
    private int accNo;
    private String customerName;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public SavingsAccount() {}

    public SavingsAccount(int accNo, String customerName, double balance) {
        this.accNo = accNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    /**
     * method to depost amount
     * @param amt
     */
    @Override
    public void depositAmount(double amt) {
        balance += amt;
    }

    /**
     * @param amt
     */
    @Override
    public void withdrawAmount(double amt) {
        balance -= amt;
    }

    /**
     * @param accountNo
     */
    @Override
    public void showBalance(int accountNo) {

    }
}
