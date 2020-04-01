class BankAccount {

    private int balance;
    private boolean flag;

    public BankAccount() {
        this.flag = false;
        this.balance = 0;
    }

    public void open() {
        flag = true;
    }


    public synchronized void deposit(int value) throws BankAccountActionInvalidException {
        if (value < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if (!flag) throw new BankAccountActionInvalidException("Account closed");
        balance += value;
    }

    public  synchronized void withdraw(int value) throws BankAccountActionInvalidException {
        if (balance == 0) throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        if (value > balance) throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        if (value < 0) throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if (!flag) throw new BankAccountActionInvalidException("Account closed");

        balance -= value;
    }


    public int getBalance() throws BankAccountActionInvalidException {
        if (!flag) throw new BankAccountActionInvalidException("Account closed");

        return balance;
    }

    public void close() {
        flag = false;
    }

}