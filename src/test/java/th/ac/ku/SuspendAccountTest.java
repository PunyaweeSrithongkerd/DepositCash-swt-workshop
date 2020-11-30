package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuspendAccountTest {
    @Test
    void If_Suspend_Account_Result_Should_be_True(){
        Agent agent = new Agent();
        Boolean actualResult = agent.CheckSuspendAccount("111111111");
        assertEquals(true,actualResult);
    }

    @Test
    void If_Not_Suspend_Account_Result_Should_be_False(){
        Agent agent = new Agent();
        Boolean actualResult = agent.CheckSuspendAccount("000000000");
        assertEquals(false,actualResult);
    }
}
