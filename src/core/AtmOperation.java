package core;

import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmOperationInteface{
    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()) {
            ministmt.put(withdrawAmount, " Amount withdrawn");
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
        ministmt.put(depositAmount, " Amount deposited");
        System.out.println(depositAmount + " Deposit successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
