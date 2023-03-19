/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      harrysChecking.deposit(2000);
      harrysChecking.withdraw(500);
      System.out.println("Harry's Checking: " + harrysChecking.getBalance());
      System.out.println("Expected: 1500");

      BankAccount sallysChecking = new BankAccount(3000);
      sallysChecking.withdraw(500);
      System.out.println("Sallys's Checking: "+ sallysChecking.getBalance());
      System.out.println("Expected: 2500");
      
   }
}
