package BankAccount;

class AccountsInBank{

    AccountsInBank (){

    }

     AccountsOperations[] allAccounts = new AccountsOperations[3];

    {
        allAccounts[0] = new AccountsOperations("Mike", "BG80 BNBG 9661 1020 3456 78", 2925.30, "BGN");
        allAccounts[1] = new AccountsOperations("Carl", "BG80 BNBG 9651 1044 3666 98", 129.30, "USD");
        allAccounts[2] = new AccountsOperations("Paul", "BG80 BNBG 9361 1120 3056 28", 11239.18, "EUR");
    }
}
