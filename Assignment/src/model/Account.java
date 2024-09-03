package model;

public interface Account {
    public void depositAmount(double amt);
    public void withdrawAmount(double amt);
    public void showBalance(int accountNo);
}
