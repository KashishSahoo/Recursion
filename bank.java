class bank {

    abstract class Transaction {
        abstract void deposit(double amt);
        abstract int withdraw(double amt);   
    }

    public class BankAccount {
        private String accNo;
        private String accHoldName;
        private double balance;
        // Constructor
        public BankAccount(String accNo, String accHoldName, double balance) {
            this.accNo = accNo;
            this.accHoldName = accHoldName;
            this.balance = balance;
        }

        //setters
        public void setAccNo(String accNo){
            this.accNo=accNo;
        }
        public void setAccHoldName(String accHoldName){
            this.accHoldName=accHoldName;
        }
        public void setBalance(double balance){
            if(balance<0){
                System.out.println("Balance cannot be negative");
                return;
            }
            this.balance=balance;
        }
       //getters
        public String getAccNo(String accHoldNameCheck){
            if(accHoldNameCheck==accHoldName){
                return accNo;
            }
            return "Unauthenticated User";
        }
        public String getAccHoldName(){
            return accHoldName;
        }
        public double getBalance(){
            return balance;
        }

    }

    class SavingsAccount extends BankAccount{
        public double interestRate;
        public double SI;
        public int principleAmt;
        public int time;

        SavingsAccount(String accNo,String accHoldName,double balance,double interestRate){
            super(accNo,accHoldName,balance);
            this.interestRate=interestRate;
        }
        

        public double deposit(double amt){
           double balance=getBalance();
           balance=balance+amt;
           return balance;
        }

        public double withdraw(double amt){
            double balance=getBalance();
            balance=balance-amt;
            return balance;
        }
        
        public void setInterestRate(double interestRate){
            this.interestRate=interestRate;
        }
        public double getInterestRate(double SI,int principleAmt,int time){
            this.SI=SI;
            this.principleAmt=principleAmt;
            this.time=time;

            this.interestRate=(this.SI *100)/this.principleAmt*this.time;
            return interestRate;
        }
    }
    class CurrentAccount extends BankAccount{
        CurrentAccount(String accNo,String accHoldName,double balance){
            super(accNo,accHoldName,balance);
        }
        public double deposit(double amt){
            double balance=getBalance();
            balance=balance+amt;
            return balance;
         }
 
         public double withdraw(double amt){
             double balance=getBalance();
             balance=balance-amt;
             return balance;
         }
        double overDraftLimit=8000;
        double currAmt=getBalance();
        double canWithdraw=currAmt+overDraftLimit;
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new bank().new SavingsAccount("12345", "John Doe", 1000.0, 5.0);
        System.out.println("Account Holder: " + s1.getAccHoldName());
        System.out.println("Account Balance: " + s1.getBalance());
        System.out.println("Depositing 500...");
        s1.setBalance(s1.deposit(500));
        System.out.println("New Balance: " + s1.getBalance());
        System.out.println("Withdrawing 200...");
        s1.setBalance(s1.withdraw(200));
        System.out.println("New Balance: " + s1.getBalance());
        System.out.println("****************************************************");
        CurrentAccount c1 = new bank().new CurrentAccount("67890", "Jane Doe", 2000.0);
        System.out.println("Account Holder: " + c1.getAccHoldName());
        System.out.println("Account Balance: " + c1.getBalance());
        System.out.println("Depositing 1000...");
        c1.setBalance(c1.deposit(1000));
        System.out.println("New Balance: " + c1.getBalance());
        System.out.println("Withdrawing 500...");
        c1.setBalance(c1.withdraw(500));
        System.out.println("New Balance: " + c1.getBalance());
    }


}