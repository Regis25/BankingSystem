package org.jalasoft;

/**
 * 
 */
public class BankAccount {

    private int accountNumber;
    private AccountOrigin accountOrigin;
    private int balance;
<<<<<<< HEAD

    /**
     * Create a new account with 0 balance
     * 
     * @param accountNumber the unique identifier for a bank account
     * @param accountOrigin represent where the account was created
=======
 
    /**
     * @param accountNumber the unique identifier for a bank account
     * @param AccountOrigin represent where the account was created
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
     */
    public BankAccount(int accountNumber, AccountOrigin accountOrigin) {
        this.accountNumber = accountNumber;
        this.accountOrigin = accountOrigin;
<<<<<<< HEAD
        this.balance = 0;
=======
        balance = 0;
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }

    /**
     * @return the unique identifier of the account
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Return the current balance of a given account
     * 
     * @return the balance of the given account
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @return the origin where the account was created
     */
    public AccountOrigin getAccountOrigin() {
        return accountOrigin;
    }

    /**
     * This increase the amount of the balance applying the following restrictions:
<<<<<<< HEAD
     *  The amount must be greater than 0
     * 
     * @param amount the amount that will be increased
     * @throws IllegalArgumentException will be throw if the amount is less or equals than 0
     */
    public void deposit(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("The deposit amount must be greater than 0");
        }

        balance += amount;
    }

    /**
     * This decrease the amount of the balance applying the following restrictions:
     * - The amount cannot be greater than the current balance
     * 
     * @param amount the amount that will be decrease
     */
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount to withdraw must be greater than 0.");
        }

        if (amount > balance) {
            throw new ArithmeticException("Cannot withdraw amounts greater than the actual balance: " + getBalance());
        }

        balance -= amount;
    }

    /**
     * Will check if the amount can be supported by the current balance 
     * by checking if the loan amount divided by 2 is less or equals to current balance
     * 
     * @param amount the amount to check
     * @return wether the amount is supported or not
     */
    public boolean hasEnoughCollateral(int amount) {
        return amount > 0 && balance >= amount / 2;
=======
     * 
     * @param amount the amount that will be increased
     */
    public boolean deposit(int amount) {
        balance = balance + amount;
        return true;
    }

    /**
     * Will check if the amount can be supported by the current balance
     * 
     * <<explain how the check will be performed>>
     * 
     * @param amount the amount to check
     * @return wether the amount is supported or not
     */
    public boolean hasEnoughCollateral(int amount) {
        return balance >= (amount / 2);
    }


    /**
     * This decrease the amount of the balance applying the following restrictions:
     * - The amount cannot be greater than the current balance
     * 
     * @param amount the amount that will be decrease
     */
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }

    /**
     * Change the account origin applying the following actions:
     * - change the limit for withdraw
     * - change the restriction for loan
     * - etc
     * 
     * @param AccountOrigin the new account origin to change, it will decide how the restriction or facilities will change
     * @return
     * 
     * DO NOT IMPLEMENT IT: STILL IN DESIGN
     */
    public boolean changeAccount(AccountOrigin AccountOrigin) {
        return false;
    }
<<<<<<< HEAD
=======




>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
}