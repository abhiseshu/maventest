//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;

public class TestMain {
    static Main main;


    public static void main(String []args){
        System.out.println("Hellon");

    }

    public static void testAdd(){
        main = new Main();
        System.out.println(main.add(1,2));
    }
}
