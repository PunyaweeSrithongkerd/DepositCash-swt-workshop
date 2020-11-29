package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

    @Test
    void deposit_Less_Than_30000_Per_Transaction_Result_Should_Be_True(){
        // Arrange
        Boolean expectedResult  = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerTransaction(depositCash);

        //Assert
        assertEquals(true, actualResult);

    }

    @Test
    void deposit_Equal_To_30000_Per_Transaction_Result_Should_Be_True(){
        // Arrange
        Boolean expectedResult  = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerTransaction(depositCash);

        //Assert
        assertEquals(true, actualResult);

    }

    @Test
    void deposit_More_Than_30000_Per_Transaction_Result_Should_Be_False(){
        // Arrange
        Boolean expectedResult  = false;
        float depositCash = 35000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerTransaction(depositCash);

        //Assert
        assertEquals(false, actualResult);

    }

    @Test
    void deposit_Less_Than_50000_Per_Day_Result_Should_be_True(){
        // Arrange
        Boolean expectedResult  = true;
        float depositCash = 45000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerDay(depositCash);

        //Assert
        assertEquals(true, actualResult);
    }

    @Test
    void deposit_Equal_To_50000_Per_Day_Result_Should_be_True(){
        // Arrange
        Boolean expectedResult  = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerDay(depositCash);

        //Assert
        assertEquals(true, actualResult);
    }

    @Test
    void deposit_More_Than_50000_Per_Day_Result_Should_be_False(){
        // Arrange
        Boolean expectedResult  = true;
        float depositCash = 55000.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckDepositPerDay(depositCash);

        //Assert
        assertEquals(false, actualResult);
    }
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
    @Test
    void deposit_More_Than_Minimum_Result_Should_be_True() {
        // Arrange
        Boolean expectedResult = true;
        float depositCash = 150.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckMinimumDeposit(depositCash);

        //Assert
        assertEquals(true, actualResult);
    }
    @Test
    void deposit_Equal_to_Minimum_Result_Should_be_True() {
        // Arrange
        Boolean expectedResult = true;
        float depositCash = 100.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckMinimumDeposit(depositCash);
        //Assert
        assertEquals(true, actualResult);
    }
    @Test
    void deposit_Less_Than_Minimum_Result_Should_be_False() {
        // Arrange
        Boolean expectedResult = false;
        float depositCash = 90.00f;
        Agent agent = new Agent();
        //Act
        Boolean actualResult = agent.CheckMinimumDeposit(depositCash);

        //Assert
        assertEquals(false, actualResult);
    }
}
