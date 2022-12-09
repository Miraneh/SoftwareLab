import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoatTest {

    @Test
    void coatTest() {
        Director director = new Director();

        CoatBuilder builder = new CoatBuilder();
        director.constructCoat(builder);
        Coat coat = builder.getResult();
        assertAll(() -> assertEquals(coat.getType(), ClothingType.COAT),
                () -> assertEquals(coat.getColor(), "Blue"),
                () -> assertEquals(coat.getSize().getLength(), 90),
                () -> assertEquals(coat.getSize().getWidth(), 0));
    }
}