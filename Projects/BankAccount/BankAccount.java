import java.util.*;

class BankAccount 
{
    private String name; 
    private double balance;
    
    public BankAccount() 
    {
        name = "";
    }
    
    //Constructor
    
    public BankAccount(String nameln, double balanceln) 
    {
        name = nameln;
        balance = balanceln;
    }
    
    //name getter
    public String setName()
    {
        return name;
    }
    
    //balance getter
    public double getBalance()
    {
        return balance;
    }
    
    //withdrawal
    public void withdraw(int amount) 
    {
        balance = balance - amount;
    }
    
    //deposit
    public void deposit (int amount)
    {
        balance = balance + amount;
    }
    
    //Statement that shows name and balance
    public String toString() 
    {
        return name + "\t" + balance + "\n";
    }
}









