package TesteNumere;

import Exercitiul3.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TesteNumere {
    //public static int[] fibo = new int[20];
    static boolean Fibonacci(int N, int M)
    {
        int i = 0,a=0,b=1, c;
        while(i<100)
        {
            if(N==a && M == b)
                return true;
            a = a + b;
            b = b + a;
            i++;
        }
        return false;
    }
    @Test
    void test1_fibo() {
        PerecheNumere c=new PerecheNumere(4,5);
        //(9, c.suma());
    }
    @Test
    void test2_suma() {
        PerecheNumere c=new PerecheNumere(4,5);
        //assertTrue(c.suma()==4);
    }
    @Test
    void test3_suma() {
        PerecheNumere c=new PerecheNumere(4,5);
        //assertFalse(c.suma()!=10);
    }
}
