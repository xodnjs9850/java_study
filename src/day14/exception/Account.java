package day14.exception;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withDraw(int money) throws BalanceInsufficientException {

        if (balance < money) {
            throw new BalanceInsufficientException("잔액이 부족함!");
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
