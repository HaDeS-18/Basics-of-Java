/* Write a java pgm to create a class BankAccount withe methods deposit() and withdraw()
 * Create a subclass SavingsAccount that overrides withdraw() method, that checks if balance
 * in SavingsAccount will be less than 100 after withdrawal, then do not allow to withdraw. */

class BankAccount
{
    private String accno;
    private double balance;
    public BankAccount(String accno, double balance)
    {
        this.accno = accno;
        this.balance = balance;
    }
    public void deposit(double x)
    {
        balance += x;
        System.out.println("Deposit "+x+" to the bank account "+accno);
    }
    public void withdraw(double x)
    {
        balance -= x;
        System.out.println("Withdraw "+x+" from the bank account "+accno);
    }
    public double getBalance()
    {
        return(balance);
    }
}
class SavingsAccount extends BankAccount
{
    public SavingsAccount(String accno, double balance){super(accno, balance);}
    // Override
    public void withdraw(double x)
    {
        if(getBalance() - x < 100)
            System.out.println("Insufficient balance");
        else
            super.withdraw(x);
    }
}
public class Pgm49 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("BA6249", 1000);
        sa.deposit(50);
        sa.withdraw(700);
        sa.withdraw(275);
        sa.withdraw(100);
        System.out.println("The final balance is "+sa.getBalance());
    }
}
