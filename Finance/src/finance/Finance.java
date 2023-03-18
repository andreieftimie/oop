/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;

/**
 *
 * @author alexb
 */

public class Finance {

    /**
     * @param args the command line arguments
     */
    
    /*static Account magistral1;
    static Account magistral2;
    
    static{
        magistral1 = new Account();
        magistral2 = new Account();
        
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int x = 3;
        Account  a = new Account();
        
       // String s = "";
              
        Account ax = new Account("Ion", "USD");
        
        a.openAccount("Ionescu Alex", "RON");
        
        ax.openAccount("Ion", "USD", 100);
        
        a.credit(100);
        
        System.out.println("Balance: " + a.balance);
        
        a.debit(50);       
        
        System.out.println("Balance: " + a.balance);
        
        Account.getMonthlyCommission(a);
        
        System.out.println("Balance: " + a.balance);
        
        Account a1 = new Account();
        
        a1.openAccount("Popescu George", "EUR");
        
        System.out.println("AccountCounter on a:" + a.AccountCounter);
        System.out.println("AccountCounter on a1:" + a1.AccountCounter);
        System.out.println("AccountCounter on Account class:" + Account.AccountCounter);
        
        //a1 = a;
        
       // System.out.println("Balance: " + a.balance);
       // System.out.println("Balance: " + a1.balance);
        
        Account[] accounts = new Account[5];
        
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new Account();
        }
        
        for(Account currentAccount : accounts)
        {
            currentAccount.credit(10);
        }
        
        System.out.print("\n----\n");
        System.out.print("Exemplu operator\n");
        System.out.print("\n----\n");
        
        OperatorBanca operator1 = new OperatorBanca("Ion", "Iliescu");
        operator1.openAccount("Ionel", "€");
        operator1.openAccount("Maria", "$", 100);
        operator1.listAccounts();
        
        System.out.print("\n----\n");
        
        OperatorBanca operator2 = new OperatorBanca("Traian", "Băsescu", "BT Calea Turzii");
        operator2.openAccount("John", "GBP", 10);
        operator2.openAccount("Matilda", "RON", 999);
        operator2.listAccounts();
    }    
   
    
}
