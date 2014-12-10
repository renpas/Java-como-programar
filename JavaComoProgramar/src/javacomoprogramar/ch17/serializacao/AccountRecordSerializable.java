package javacomoprogramar.ch17.serializacao;

import java.io.Serializable;

/**
 * Classe AccountRecordSerializable para objetos serializáveis.
 * @author renan.souza
 */
public class AccountRecordSerializable implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public AccountRecordSerializable(){
        this(0,"","",0);
    }
    
    public AccountRecordSerializable(int acct, String first, String last, double bal){
        setAccount(acct);
        setFirstName(first);
        setLastName(last);
        setBalance(bal);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
