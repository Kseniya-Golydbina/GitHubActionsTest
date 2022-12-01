import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator main=new Calculator();

    @Test
    void additional(){
        assertEquals(2, main.add(1, 1));
    }
    @Test
    void difference(){
        assertEquals(1, main.diff(3, 2));
    }
    @Test
    void multiplication(){
        assertEquals(4, main.increase(2, 2));
    }
    @Test
    void segmentation(){
        assertEquals(2, main.division(4, 2));
    }
}
