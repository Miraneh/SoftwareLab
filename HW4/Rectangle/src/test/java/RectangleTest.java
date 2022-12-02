import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    void setArea(Rectangle rectangle, double width, double length) {
        rectangle.setLength(length);
        rectangle.setWidth(width);
        assert rectangle.area() == width * length;
    }
}


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

    @Test
    void testInheritance() {
        Rectangle rectangle = new Rectangle(1, 5);
        AreaTest test = new AreaTest();
        test.setArea(rectangle, 2, 6);
    }
}

class SquareTest{
    @Test
    void sameWidthLength() {
        Square square = new Square(4);
        Square square1 = new Square(5);
        square1.setLength(2);
        assertAll(() -> assertEquals(square.getWidth(), square.getLength()),
                () -> assertEquals(2, square1.getWidth()));
    }

    @Test
    void setWidthOrLength() {
        Square square = new Square(4);
        square.setLength(3);
        Rectangle square1 = new Square(4);
        square.setLength(3);
        assertAll(() -> assertEquals(square.getWidth(), square.getLength()),
                () -> assertEquals(square1.getWidth(), square.getLength()));
    }

    @Test
    void area() {
        Square square = new Square(4);
        assertEquals(16, square.area());
    }

    @Test
    void testInheritance() {
        Square square = new Square(5);
        AreaTest test = new AreaTest();
        test.setArea(square, 2, 6);
    }

}
