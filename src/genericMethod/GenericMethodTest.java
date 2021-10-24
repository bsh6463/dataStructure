package genericMethod;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericMethodTest {

    Point<Integer, Double> p1 = new Point<>(2, 10.0);
    Point<Integer, Double> p2 = new Point<>(5, 5.0);

    @Test
    void genericMethodTest(){

        double size = GenericMethod.makeRectangle(p1, p2);

        System.out.println("size = " + size);
        Assertions.assertEquals(size, 15);
    }
}