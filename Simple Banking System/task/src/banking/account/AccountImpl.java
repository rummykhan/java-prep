package banking.account;

public class AccountImpl implements Account {

    private final int binNumber;
    private final long accountSequence;
    private final int checkSum;
    private final int pinCode;
    private double balance;

    public AccountImpl(int binNumber, long accountSequence, int checkSum, int pinCode) {
        this.binNumber = binNumber;
        this.accountSequence = accountSequence;
        this.checkSum = checkSum;
        this.pinCode = pinCode;
        this.balance = 0;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getCardNumber() {
        return this.binNumber + "" + this.accountSequence + "" + this.checkSum;
    }

    @Override
    public String getPinCode() {
        return String.valueOf(this.pinCode);
    }

    @Override
    public boolean pinMatches(String pinCode) {
        return String.valueOf(this.pinCode).equals(pinCode);
    }
}
