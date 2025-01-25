abstract class Transaction {
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
}

class BankAccount extends Transaction {
    private String accNo;
    private String accHoldName;
    private double balance;

    // Constructor
    public BankAccount(String accNo, String accHoldName, double balance) {
        this.accNo = accNo;
        this.accHoldName = accHoldName;
        this.balance = balance;
    }

    // Setters
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccHoldName(String accHoldName) {
        this.accHoldName = accHoldName;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative");
            return;
        }
        this.balance = balance;
    }

    // Getters
    public String getAccNo(String accHoldNameCheck) {
        if (accHoldNameCheck.equals(accHoldName)) {
            return accNo;
        }
        return "Unauthenticated User";
    }

    public String getAccHoldName() {
        return accHoldName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        setBalance(getBalance() + amt);
        System.out.println("Deposited " + amt + ". New Balance: " + getBalance());
    }

    @Override
    public void withdraw(double amt) {
        if (amt > getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }
        setBalance(getBalance() - amt);
        System.out.println("Withdrew " + amt + ". New Balance: " + getBalance());
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accNo, String accHoldName, double balance, double interestRate) {
        super(accNo, accHoldName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

class CurrentAccount extends BankAccount {
    private double overDraftLimit;

    CurrentAccount(String accNo, String accHoldName, double balance, double overDraftLimit) {
        super(accNo, accHoldName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amt) {
        if (amt > (getBalance() + overDraftLimit)) {
            System.out.println("Withdrawal amount exceeds overdraft limit");
            return;
        }
        setBalance(getBalance() - amt);
        System.out.println("Withdrew " + amt + ". New Balance: " + getBalance());
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}

public class bank2 {
    public static void main(String[] args) {
        // Savings Account Test
        SavingsAccount s1 = new SavingsAccount("12345", "John Doe", 1000.0, 5.0);
        System.out.println("Account Holder: " + s1.getAccHoldName());
        System.out.println("Account Balance: " + s1.getBalance());
        s1.deposit(500);
        s1.withdraw(200);
        System.out.println("****************************************************");

        // Current Account Test
        CurrentAccount c1 = new CurrentAccount("67890", "Jane Doe", 2000.0, 8000.0);
        System.out.println("Account Holder: " + c1.getAccHoldName());
        System.out.println("Account Balance: " + c1.getBalance());
        c1.deposit(1000);
        c1.withdraw(9500);
        c1.withdraw(500);
    }
}

