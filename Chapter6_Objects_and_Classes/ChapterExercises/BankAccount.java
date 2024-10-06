/**
 * The BankAccount class simulates a bank account.
 */

public class BankAccount 
{
    private double balance;     //Account balance
    
    /**
     * No-arg constructor sets the starting balance account
     */
    
    public BankAccount()
    {
        balance = 0.0;
    }
    
    /**
     * This constructor sets the starting balance to the 
     * value passed as an argument. 
     * @param startBalance The starting balance. 
     */
    
    public BankAccount (double startBalance)
    {
        balance = startBalance;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    /**
     * The withdraw method subtracts an amount from
     * the account. 
     * @param amount The amount to subtract from 
     *               the balance. 
     */
    
    public void withdraw(double amount)
    {
        balance -= amount; 
    }
    
    /**
     * The getBalance method returns the 
     * account balance. 
     * @return The value in the balance field.
     */
    
    public double getBalance()
    {
        return balance; 
    }
}
