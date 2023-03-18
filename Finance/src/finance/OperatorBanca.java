/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

import java.util.*;

/**
 * 1.	In proiectul Finance creati o clasa OperatorBanca. DONE
 * 2.	In clasa operator adaugati 4 atribute si 2 metode specifice unui operator. DONE
 * 3.	Integrati clasa respectiva in exemplul existent: “Un operator deschide un cont si depune o suma de bani in contul respectiv.” DONE
 * 4.	Adaugati 2 constructori specifici clasei OperatorBanca. DONE
 */

/**
 *
 * @author andreieftimie
 */
public class OperatorBanca {
    String numeOperator = "";
    String prenumeOperator = "";
    String sucursala = "";
    public ArrayList<Account> accounts = new ArrayList<Account>();
    
    public OperatorBanca(String nume, String prenume) {
        this.numeOperator = nume;
        this.prenumeOperator = prenume;
    }
    
    public OperatorBanca(String nume, String prenume, String sucursala) {
        this.numeOperator = nume;
        this.prenumeOperator = prenume;
        this.sucursala = sucursala;
    }
    
    public void openAccount(String owner, String moneda) {
        Account account = new Account(owner, moneda);
        this.accounts.add(account);
    }
    public void openAccount(String owner, String moneda, double balance) {
        Account account = new Account();
        account.openAccount(owner, moneda, balance);
        this.accounts.add(account);
    }
    
    public void listAccounts() {
        for (Account account : this.accounts) {
            if (this.sucursala.length() != 0) {
                System.out.print("Contul deschis de " + this.numeOperator + " " + this.prenumeOperator + " din sucursala " + this.sucursala + " pentru " + account.owner + " cu moneda " + account.moneda + " si balance " + account.balance + "\n");
            } else {
                System.out.print("Contul deschis de " + this.numeOperator + " " + this.prenumeOperator + " pentru " + account.owner + " cu moneda " + account.moneda + " si balance " + account.balance + "\n");
            }
        }
    }
}
