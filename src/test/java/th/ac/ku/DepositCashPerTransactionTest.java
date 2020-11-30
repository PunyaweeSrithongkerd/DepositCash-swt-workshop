package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTransactionTest {

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
        assertEquals(false, actualResult); }
}
