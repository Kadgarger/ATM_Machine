package core;

public class AtmOperation implements AtmOperationInteface{
    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()) {
            System.out.println("Collect the cash " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else {
            System.out.println("You try to take more cash than you balance. Input correct number");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " Deposit successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}
