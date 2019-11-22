package org.jalasoft;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/*
 * BankTests
 */
public class BankTests {

    @Test
    public void createNewAccount() {

        // Arrange
        Bank bank = new Bank();

        // Act
        int accountZero =  bank.newAccount();
        int accountOne =  bank.newAccount();
        int accountTwo =  bank.newAccount();
        int accountThree =  bank.newAccount();

        // Assert
        assertEquals(0, accountZero);
        assertEquals(1, accountOne);
        assertEquals(2, accountTwo);
        assertEquals(3, accountThree);
    }

    @Test
    public void authorizeLoan() {

        // Arrange
        Bank bank = new Bank();
        int accountZero =  bank.newAccount();
        bank.deposit(accountZero, 100);

        // Act
        boolean resultOne = bank.authorizeLoan(accountZero, 100);
        boolean resultTwo = bank.authorizeLoan(accountZero, 200);
        boolean resultThree = bank.authorizeLoan(accountZero, 300);

        // Assert
        assertTrue(resultOne);
        assertTrue(resultTwo);
        assertFalse(resultThree);
    }

    @Test
    public void depositToTheAccount() {

        // Arrange
        Bank bank = new Bank();
        int accountZero =  bank.newAccount();

        // Act
        bank.deposit(accountZero, 100);
        int actualBalance =  bank.getBalance(accountZero);

        // Assert
        assertEquals(100, actualBalance);
    }

    @Test
    public void payInterestTest() {

        // Arrange
        Bank bank = new Bank();
        int accountZero =  bank.newAccount();
        bank.deposit(accountZero, 1000);
        int expectedInterest = (int)(1000 * (1 + 0.01));

        //Act
        bank.payInterest();
        int actualInterest = bank.getBalance(accountZero);

        // Assert
        assertEquals(expectedInterest, actualInterest);
    }
}