package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositTest {
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
