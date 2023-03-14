package objects;

public class BankAccount {

    String accountNumber;// 8 digits

    String accountHolderName;

    double balance;

    double dailyWithdrawLimit = 5000;

    double getDailyWithdrawedAmount;

       public void setAccountNumber(String accountNumber){
           boolean isValidAccountNumber = true;

           if (accountNumber.length() == 8){

           for (int i = 0; i < 8; i++){
               if (!Character.isDigit(accountNumber.charAt(i))){
                   System.out.println("WARNING: account number must only contain only digits");
                   isValidAccountNumber = false;
                   break;
               }
               }

       }
           else
               System.out.println("WARNING: the length of an account number must be 8");
               isValidAccountNumber = false;

       if (isValidAccountNumber){
           System.out.println("SUCCESS! account number is valid");
           this.accountNumber = accountNumber;
       }
       else
           System.out.println("FAILURE: the provided account number is not valid");
       }


        public String getAccountNumber(){
            System.out.println("account number " + accountNumber);
        return accountNumber;
        }
public void setAccountHolderName(String accountHolderName){
           boolean isValidAccountHolderName = true;
           if (accountHolderName.equals(null) || accountHolderName.isEmpty() || accountHolderName.trim().length() == 0 ||
           accountHolderName.length() > 256){
               isValidAccountHolderName = false;

           }
           if (isValidAccountHolderName){
               this.accountHolderName = accountHolderName;
               System.out.println("SUCCESS: account holder name is valid");
           }
           else
               System.out.println("failure. input valit account holder name");
}
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(accountHolderName + " successfully deposited " + amount + "$");
    }

    public boolean withdraw(double amount){
        if (balance >= amount && amount > 0 && dailyWithdrawLimit >= amount &&
                getDailyWithdrawedAmount + amount <= dailyWithdrawLimit){
            balance -= amount;
            getDailyWithdrawedAmount += amount;
            System.out.println("SUCCESS: money were withdrawed");
            return true;
        }
        System.out.println("Invalid withdraw amount. Please try again");
        return false;
    }

    public void printInfo(){
           String str = "Account holder's name: " + accountHolderName + "\n" +
                   "Account number: " + accountNumber + "\n" +
                   "Current balance: " + balance + "\n" +
                   "Today withdrawed: " + getDailyWithdrawedAmount + "$";
        System.out.println(str);
    }
}
