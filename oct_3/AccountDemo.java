package oct_3;

public class AccountDemo {
    public static void main(String[] args) {
        SavaingAccount sa = new SavaingAccount();
        sa.holder_name = "Jay";
        sa.account_no = 123456;
        sa.balance = 10000;
        sa.type = "Savaing";
        sa.deposit(5000);
        sa.withdraw(2000);
        sa.computeInterest();
        sa.display();

        CurrentAccount ca = new CurrentAccount();
        ca.holder_name = "Vijay";
        ca.account_no = 123456;
        ca.balance = 10000;
        ca.type = "Current";
        ca.deposit(5000);
        ca.withdraw(2000);
        ca.computeInterest();
        ca.display();

    }
}

abstract class Account {
    String holder_name;
    int account_no;
    double balance;
    String type;

    abstract void deposit(int amount);

    abstract void withdraw(int amount);

    abstract void computeInterest();

    abstract void display();
}

class SavaingAccount extends Account {
    @Override
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Current balance is " + balance);
    }

    @Override
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawl successful");
            System.out.println("Remaining balance is " + balance);
        }
    }

    @Override
    void computeInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest is " + interest);
    }

    @Override
    void display() {
        System.out.println("Savaing Account Details");
        System.out.println("Holder name is " + holder_name);
        System.out.println("Account no is " + account_no);
        System.out.println("Balance is " + balance);
    }
}

class CurrentAccount extends Account {
    double min_balance = 5000;

    @Override
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Current balance is " + balance);
    }

    @Override
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            if (balance - amount < min_balance) {
                System.out.println("Deduction of Penalty of 2% is required on Withdrawl amount !!");
                System.out.println("Do you want to continue?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = 0;
                if (choice == 1) {
                    balance -= amount- (amount * 0.02);
                    System.out.println("Withdrawl successful");
                    System.out.println("Remaining balance is " + balance);
                } else if(choice == 2) {
                    System.out.println("Withdrawl cancelled");
                }
                else {
                    System.out.println("Invalid choice");
                    System.out.println("Withdrawl cancelled");
                }
            } else {
                balance -= amount;
            }
        }
    }


    @Override
    void computeInterest() {
        System.out.println("Current account does not have interest");
    }


    @Override
    void display() {
        System.out.println("Current Account Details");
        System.out.println("Holder name is " + holder_name);
        System.out.println("Account no is " + account_no);
        System.out.println("Balance is " + balance);
    }
}
