class BankAccount {

    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Updated Interest Rate: " + interest_rate + "%");
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Amit", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        BankAccount.updateInterestRate(7.0);

        acc1.displayInterest();
        acc2.displayInterest();
    }
          }
