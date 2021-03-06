import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    Main main;

    @Test
    public void testAdd(){
        main = new Main();
        assertEquals(2,main.add(1,1));
    }
    @Test
    public void testSub(){
        main = new Main();
        assertEquals(0,main.sub(1,1));
    }
    //new comment
    //new comment at campus
    //new commit : another
}
