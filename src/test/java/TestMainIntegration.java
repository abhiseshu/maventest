import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMainIntegration {
    Main main;

    @Before
    public void testSetup(){
        main = new Main();
    }

    @Test
    public void TestohangeInResultwithAdd()
    {
        int default_result_value = 0;
        assertEquals(default_result_value,main.getResult());
        int first_num = 2;
        int seound_num = 1;
        int expAddResult =  3;
        assertEquals(expAddResult,main.add(first_num,seound_num));
        int newExpResultVal = 3;
        assertEquals(newExpResultVal,main.getResult());
    }
    @Test
    public void TestohangeInResultwithsubtrat()
    {
        int default_result_value = 0;
        assertEquals(default_result_value,main.getResult());
        int first_num = 3;
        int seound_num = 1;
        int expAddResult =  2;
        assertEquals(expAddResult,main.sub(first_num,seound_num));
        int newExpResultVal = 2;
        assertEquals(newExpResultVal,main.getResult());
    }
    @Test
    public void TestohangeInResultwithmulti()
    {
        int default_result_value = 0;
        assertEquals(default_result_value,main.getResult());
        int first_num = 3;
        int seound_num = 1;
        int expAddResult =  3;
        assertEquals(expAddResult,main.mult(first_num,seound_num));
        int newExpResultVal = 3;
        assertEquals(newExpResultVal,main.getResult());
    }
    @Test
    public void TestohangeInResultwithdiv()
    {
        int default_result_value = 0;
        assertEquals(default_result_value,main.getResult());
        int first_num = 3;
        int seound_num = 1;
        int expAddResult =  3;
        assertEquals(expAddResult,main.div(first_num,seound_num));
        int newExpResultVal = 3;
        assertEquals(newExpResultVal,main.getResult());
    }
}
