package JAVA.Chapter04;

class BankAccount
{
    int balance=0;

    public int deposit(int amount)
    {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount)
    {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance()
    {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
public class BankAccountPO {

    public static void main(String[] args) {

        BankAccount kim = new BankAccount();
        BankAccount lee = new BankAccount();

        kim.deposit(7000);
        lee.deposit(4000);

        kim.withdraw(500);
        lee.withdraw(400);

        kim.checkMyBalance();
        lee.checkMyBalance();

    }

}
