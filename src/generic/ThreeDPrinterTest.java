package generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDPrinterTest {

    GenericPrinter<Powder> genericPrinterPowder;
    GenericPrinter<Plastic> genericPrinterPlastic;

    @BeforeEach
    void beforeTest(){
        Powder powder = new Powder();
        genericPrinterPowder = new GenericPrinter<>(powder);

        Plastic plastic = new Plastic();
        genericPrinterPlastic = new GenericPrinter<>(plastic);
    }
    @Test
    void getMaterial() {
        Plastic plastic = genericPrinterPlastic.getMaterial();
        Powder powder = genericPrinterPowder.getMaterial();

        assertEquals(plastic.getClass(), Plastic.class);
        assertEquals(powder.getClass(), Powder.class);
    }

}