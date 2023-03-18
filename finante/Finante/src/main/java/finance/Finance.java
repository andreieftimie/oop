/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package finance;

/**
 *
 * @author andreieftimie
 */
public class Finance {
    
    static Account magistral1;
    static Account magistral2;
    
    static {
        magistral1 = new Account("M1");
        magistral2 = new Account("M2");
    }

    public static void main(String[] args) {
        Account a = new Account("Ion");
        a.openAccount("Ionescu Alex", "RON");
        
        a.credit(100);

        
        a.debit(50);
        
        
        getMonthlyComission(a);
        
        Account a1 = new Account("Popescu");
        a1.openAccount("Popescu George", "EUR");
        
        a1 = a;
        
        
        Account[] accounts = new Account[5];
        for (int i=0; i<accounts.length; i++) {
            accounts[i] = new Account("I");
        }
        
        for (Account currentAccount: accounts) {
               currentAccount.credit(10);
        }
    }
    
    static void getMonthlyComission(Account account) {
        account.debit(10);
    }
}
