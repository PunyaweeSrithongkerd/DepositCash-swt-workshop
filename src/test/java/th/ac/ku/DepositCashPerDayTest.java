package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {
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
}
