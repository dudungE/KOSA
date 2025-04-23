public class Account {
    private String accountNumber;
    private String ownerName;
    private int balance;

    // 생성자, getter/setter
    public Account(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }
}

