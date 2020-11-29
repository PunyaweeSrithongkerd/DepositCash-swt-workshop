package th.ac.ku;

import java.util.Arrays;

public class Agent {
    float max_deposit_per_transaction = 30000.00f;
    float max_deposit_per_day = 50000.00f;
    float minimum_deposit = 100.00f;
    String[] suspend_list = {"123456789","111111111"};

    public Boolean CheckDepositPerTransaction(float depositCash) {
        return !(depositCash > max_deposit_per_transaction);
    }

    public Boolean CheckDepositPerDay(float depositCash) {
        return !(depositCash > max_deposit_per_day);
    }

    public Boolean CheckSuspendAccount(final String account_number) {
        return Arrays.asList(suspend_list).contains(account_number);
   }

    public Boolean CheckMinimumDeposit(float depositCash) {
        return depositCash >= minimum_deposit;
    }
}
