package banking;

import banking.auth.Authenticator;
import banking.auth.AuthenticatorImpl;
import banking.repository.AccountRepository;
import banking.repository.AccountRepositoryImpl;
import banking.ui.UserInterface;
import banking.ui.UserInterfaceImpl;

public class Main {
    public static void main(String[] args) {

        AccountRepository accountRepository = new AccountRepositoryImpl();
        UserInterface userInterface = new UserInterfaceImpl();
        Authenticator authenticator = new AuthenticatorImpl(accountRepository, userInterface);

        BankingFacade bankingFacade = new BankingFacade(accountRepository, authenticator, userInterface);
        bankingFacade.start();
    }
}