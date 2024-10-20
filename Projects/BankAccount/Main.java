import java.util.*;

public class Main
{
      public static void printAccounts(List<BankAccount> accounts) 
    {
        System.out.println("\n------------ Accounts from print function --------------");
        System.out.println("Name\tBalance");
        System.out.println( "---------------------" ) ;
        double total = 0;
        for (BankAccount oneAccount : accounts) 
        {
            System.out.print(oneAccount);
            total += oneAccount.getBalance();
        }
        System.out.println( "---------------------" ) ;
        System.out.println("Total: " + String.format( "%.2f" , (total ) ));
        System.out.println("Average: " + String.format( "%.2f" , (total / accounts.size() ) ));
    }

    public static void main(String[] args)
    {
        //john's account
        BankAccount account1 = new BankAccount("John", 12000);
        //john's withdrawal
        account1.withdraw(1000);
        //maria's account
        BankAccount account2 = new BankAccount("Maria", 50000);
        account2.deposit(6000);

          //list of many accounts
        ArrayList<BankAccount> accounts =  new ArrayList( List.of(new BankAccount ("Jake", 10000 ), new BankAccount ("Noah", 45000 ), new BankAccount ("Anne", 23000 ) ) );

         //add account1 and account2
        accounts.add(account1);
        accounts.add(account2);

        printAccounts(accounts);
        

    }
}










