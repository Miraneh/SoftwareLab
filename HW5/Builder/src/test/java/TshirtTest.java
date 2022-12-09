import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TshirtTest {

    @Test
    void tshirtTest() {
        Director director = new Director();

        TshirtBuilder builder = new TshirtBuilder();
        director.constructTshirt(builder);
        Tshirt tshirt = builder.getResult();
        assertAll(() -> assertEquals(tshirt.getType(), ClothingType.TSHIRT),
                () -> assertEquals(tshirt.getColor(), "Blue"),
                () -> assertEquals(tshirt.getSize().getLength(), 75),
                () -> assertEquals(tshirt.getSize().getWidth(), 40));
    }
}