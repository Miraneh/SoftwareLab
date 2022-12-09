import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tester {
    @Test
    void matterTest() {
        assertAll(() -> assertEquals(MatterStorage.getMatter("Solid").Shape(), "Solid matter has definite shape"),
                () -> assertEquals(MatterStorage.getMatter("Liquid").Shape(), "Liquid matter has indefinite shape"),
                () -> assertEquals(MatterStorage.getMatter("Gas").Shape(), "Gas matter has indefinite shape"));
    }
}