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
        assertEquals(7,main.add(2,5));
    }
    @Test
    public void testSub(){
        assertEquals(-1,main.sub(6,7));
    }
    @Test
    public void testMult(){
        assertEquals(0,main.mult(0,2));
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
