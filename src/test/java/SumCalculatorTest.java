import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumOneTest() {

        int expectedResult = 1;
        int actualResult = sumCalculator.sum(1);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void sumThreeTest() {

        int expectedResult = 6;
        int actualResult = sumCalculator.sum(3);

        assertEquals(expectedResult, actualResult);

    }

}
