package proCat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void multiply() {
        Utils utils = new Utils();
       int a = utils.multiply(2,3);
       assertEquals(a,6);
    }
}