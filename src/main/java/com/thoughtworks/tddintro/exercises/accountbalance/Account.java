package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private float balance = 0;

    Account(){

    }

    public float getBalance(){
        return balance;
    }

    public float balance(){

        return balance;
    }

    public boolean deposit(float amount){
        balance += amount;
        return true;
        //throw exception if amount is negative
    }

    public boolean withdraw(float amount){
        if(amount > balance){
            return false;
        }
        else {
            balance = balance - amount;
            return true;
        }
    }
}
