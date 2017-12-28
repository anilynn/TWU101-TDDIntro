package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        //Arrange
        Account account = new Account();
        account.deposit((float) 100);

        //Action
        account.deposit((float) 50);

        //Assert
        assertThat(account.getBalance(), is((float) 150));
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        //Arrange
        Account account = new Account();
        account.deposit((float) 100);

        //Action
        account.withdraw((float) 50);

        //Assert
        assertThat(account.getBalance(), is((float) 50));
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        //Arrange
        Account account = new Account();
        account.deposit((float) 50);

        //Action
        account.withdraw((float) 100);

        //Assert
        assertThat(account.getBalance(), is((float) 50));
    }
}
