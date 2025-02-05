package LAB4;

public class BankAccount {
    private double balance;

    public  void deposit(double amount)
    {
        if(amount < 0)
        {
            return;
        }

        balance += amount;
        System.out.println("Deposit amount is : " + balance);
    }

    protected  void withdraw(double amount)
    {
        if(amount < 0)
        {
            return;
        }
        if(amount <= balance)
        {
            balance -= amount;
        }

        System.out.println("withdraw amount is : " + amount);
    }

    // default access method to check the current balance
    void checkBalance()
    {
        System.out.println(balance);
    }
    

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        obj.deposit(500);

        obj.withdraw(200);

        obj.checkBalance();
    }
}


