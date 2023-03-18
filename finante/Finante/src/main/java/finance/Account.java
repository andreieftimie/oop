/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

import java.util.Random;

/**
 *
 * @author andreieftimie
 */
public class Account {
    
    String owner = "";
    String iban = "";
    private double balance = 0;
    String currency = "";
    
    private String CNP = "";
    
    public static int AccountCounter = 0;
    
    public Account(String owner) {
        this.owner = owner;
        this.iban = "undefined iban";
        this.balance = 0;
    }
    
    public void credit(double amount) {
        this.balance += amount;
        this.printNewBalance();
    }
    
    public void debit(double amount) {
        this.balance -= amount;
    }
    
    private void processOpenAccount(String owner, String currency, double balance) {
        this.owner = owner;
        this.currency = currency;
        this.balance = balance;
        this.iban = ((Integer) new Random().nextInt()).toString();
        AccountCounter++;
    }
    
    public void openAccount(String owner, String currency) {
        this.processOpenAccount(owner, currency, 0);
    }
    
    public void openAccount(String owner, String currency, double balance) {
        this.processOpenAccount(owner, currency, balance);
    }
    
    private void printNewBalance() {
        System.out.println(this.balance);
    }
    
}
