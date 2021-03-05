import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    Main main;

    @Test
    public void testAdd(){
        main = new Main();
        assertEquals(2,main.add(1,1));
    }
}
