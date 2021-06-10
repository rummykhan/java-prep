package banking.account;

import java.util.Random;

public class AccountManager {

    private static final int binNumber = 400000;
    private static long accountSequence = 100000000;

    public static Account newAccount() {

        Random random = new Random(31);

        int checkSum = random.nextInt(10);
        int pinCode = random.nextInt(9999 - 1000) + 1000;

        Account account = new AccountImpl(binNumber, accountSequence, checkSum, pinCode);

        AccountManager.accountSequence += 1;

        return account;
    }
}
