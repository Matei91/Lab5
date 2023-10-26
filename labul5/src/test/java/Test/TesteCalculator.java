package Test;

import exercitiul2.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteCalculator {
    @Test
    void test1_suma() {
        Calculator c=new Calculator(4,5);
        //System.out.println(c.suma());
        assertEquals(9, c.suma());
    }
    @Test
    void test2_suma() {
        Calculator c=new Calculator(2,2);
        assertTrue(c.suma()==4);
    }
    @Test
    void test3_suma() {
        Calculator c=new Calculator(3,7);
        assertFalse(c.suma()!=10);
    }
}
