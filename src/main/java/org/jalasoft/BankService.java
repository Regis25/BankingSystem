package org.jalasoft;

/**
 * BankService
 */
public class BankService {

    private Bank bank;
<<<<<<< HEAD

    public BankService() {
        this.bank = new Bank();
    }
    
=======
    private BankAccount bankAccount;

    public BankService() {
        bank = new Bank();
    }

>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    /**
     * Ask a given to account to bank and then grabs the balance
     * 
     * @param accountNumber account number to check balance
     * @return balance of a given account
     */
    public int getBalance(int accountNumber) {
<<<<<<< HEAD
        BankAccount bankAccount = bank.getBankAccount(accountNumber);
        return bankAccount.getBalance();
=======
        return bank.getBankAccount(accountNumber).getBalance();
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }

    /**
     * Create a new account and assign it an account number and sets the balance to 0
     * 
     * @return The account number
     */
<<<<<<< HEAD
    public int newAccount() {
        return bank.newAccount();
    }

    /**
     * Create a new account and assign it an account number and sets the balance to 0
     * 
     * @param accountOrigin the account origin that will be assigned to the account
     * @return The account number
     */
    public int newAccount(String accountOrigin) {
        // 1.- if the accountOrigin is empty we will create a local
        if (accountOrigin.equals("")) {
            return bank.newAccount();
        }
        
        // 2.- if the accountOrigin does not exist we will throw an exception
        AccountOrigin accountOriginCalculated = AccountOrigin.valueOf(accountOrigin);

        
        return bank.newAccount(accountOriginCalculated);
=======
    public int newLocalAccount() {
        return bank.newAccount(AccountOrigin.LOCAL);
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }

    /**
     * This increases the amount of balance in a given account
     * 
     * @param accountNumber the account where the amount will be deposited
     * @param amount        the amount of money that will increase the balance
     * 
<<<<<<< HEAD
     */
    public void deposit(int accountNumber, int amount) {
        BankAccount bankAccount = bank.getBankAccount(accountNumber);
        bankAccount.deposit(amount);
=======
     * @return if the transaction was executed successfully
     */
    public boolean deposit(int accountNumber, int amount) {
        //accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        bankAccount = bank.getBankAccount(accountNumber);
        return bankAccount.deposit(amount);
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }


     /**
     * Verify if the amount requested can be assigned to a given account based on
     * its current balance
     * 
     * @param accountNumber the account that we will verify on
     * @param loanAmount    the requested amount to be verified
     * @return whether the amount was approved or not
     */
    public boolean authorizeLoan(int accountNumber, int loanAmount) {
<<<<<<< HEAD
        BankAccount bankAccount = bank.getBankAccount(accountNumber);

        //Intermediate checks

=======
        bankAccount = bank.getBankAccount(accountNumber);
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
        return bankAccount.hasEnoughCollateral(loanAmount);
    }

    /**
     * This method deposit a certain amount of money to all accounts based on a
     * interest rate
<<<<<<< HEAD
     */
    public void payInterest() { 
        bank.payInterest();
=======
     * 
     * @return whether the interest payment process was successful or not
     */
    public boolean payInterest() { 
        return bank.payInterest();
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
    }

    /**
     * 
     * @return the bank information with using the bank own format
     */
    public String getBankInformation() {
        return bank.toString();
    }
<<<<<<< HEAD

    /**
     * Decreases the amount of balance of the account.
     * 
     * @param accountNumber - the account where the amount will be withdraw
     * @param amount - The amount of money that will be withdraw
     */
    public void withdraw(int accountNumber, int amount) {
        try {
            BankAccount bankAccount  = bank.getBankAccount(accountNumber);
            bankAccount.withdraw(amount);
        } catch(ArithmeticException exception) {
            System.out.println("The amount is bigger than your balance, try another amount.");
        }
    }
=======
>>>>>>> ce55ee14502f6589229efe00349d4b8a859312a2
}