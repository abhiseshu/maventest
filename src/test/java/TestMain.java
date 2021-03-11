import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMain {
    Main main;

    @Before
    public void testSetup(){
        main = new Main();
    }

    @Test
    public void testAdd(){
        assertEquals(2,main.add(1,1));
    }
    @Test
    public void testSub(){
        assertEquals(0,main.sub(1,1));
    }
    @Test
    public void testMult(){
        assertEquals(2,main.mult(1,2));
    }
    @Test
    public void testDiv(){
        assertEquals(3,main.div(10,3));
    }

    @Test
    public void testgetResult(){

        assertNotEquals(null,main.getResult());
    }
    @Test
    public void testClear(){
        assertEquals(0,main.clear());
    }

}
