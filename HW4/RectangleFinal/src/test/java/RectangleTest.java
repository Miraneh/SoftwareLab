import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidthOrLength() {
        Rectangle rectangle = new Rectangle(1, 5);
        assertAll(() -> assertEquals(1, rectangle.getWidth()),
                () -> assertEquals(5, rectangle.getLength()));
    }

    @Test
    void setWidthOrLength() {
        Rectangle rectangle = new Rectangle(1, 5);
        rectangle.setWidth(2);
        rectangle.setLength(6);
        assertAll(() -> assertEquals(2, rectangle.getWidth()),
                () -> assertEquals(6, rectangle.getLength()));
    }

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(1, 5);
        assertAll(() -> assertEquals(5, rectangle.area()));
    }
}

class SquareTest{
    @Test
    void sameWidthLength() {
        Square square = new Square(5);
        square.setSide(2);
        assertAll(() -> assertEquals(2, square.getSide()));
    }

    @Test
    void area() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

}