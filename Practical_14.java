class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo,String name,double bal)
    {
        accountNumber=accNo;
        accountHolderName=name;
        balance=bal;
    }

    void deposit(double amount)
    {
        balance=balance+amount;
    }

    void withdraw(double amount)
    {
        balance=balance-amount;
    }

    void checkBalance()
    {
        System.out.println("Balance="+balance);
    }
}

class SavingAccount extends BankAccount
{
    double calculateInterest()
    {
        return balance*0.04;
    }
}

class FixedDepositAccount extends BankAccount
{
    double maturityAmount(int years)
    {
        return balance+(balance*0.06*years);
    }
}

class Main
{
    public static void main(String args[])
    {
        SavingAccount s=new SavingAccount();
        s.openAccount(101,"Rahul",1000);
        s.deposit(500);
        s.checkBalance();
        System.out.println("Interest="+s.calculateInterest());

        FixedDepositAccount f=new FixedDepositAccount();
        f.openAccount(102,"Amit",2000);
        f.checkBalance();
        System.out.println("Maturity Amount="+f.maturityAmount(2));
    }
  }
