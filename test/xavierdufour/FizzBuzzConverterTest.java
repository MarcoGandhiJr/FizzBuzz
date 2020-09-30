package xavierdufour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {

    private final FizzBuzzConverter converter;

    FizzBuzzConverterTest() {
        this.converter = new FizzBuzzConverter();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", converter.convert(3));
        assertEquals("Fizz", converter.convert(9));
        assertEquals("Fizz", converter.convert(21));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", converter.convert(5));
        assertEquals("Buzz", converter.convert(25));
        assertEquals("Buzz", converter.convert(50));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz Buzz", converter.convert(15));
        assertEquals("Fizz Buzz", converter.convert(30));
        assertEquals("Fizz Buzz", converter.convert(45));
    }

    @Test
    public void testNormal() {
        assertEquals("1", converter.convert(1));
        assertEquals("7", converter.convert(7));
    }
}