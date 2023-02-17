package TransportTest;

import internal.transport.Automobile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TransportTest {
    int resultInt;
    int expectedInt;
    String resultString;
    String expectedString;
    float resultFloat;
    float expectedFloat;

    Automobile bmw = new Automobile("black", 157.97f, 1500, "bmw", 2015);
    @Test
    protected void info() {
        Automobile gaz = new Automobile();
        resultString = gaz.info("black", 100.07f, 2343, "gaz", 1999);
        expectedString = "View Transport: Automobile. Brand: gaz. Year of issue: 1999. Weight: 2343. Color: black. Speed: 100.07";
        assertEquals(resultString, expectedString);
        resultString = bmw.info();
        expectedString = "View Transport: Automobile. Brand: bmw. Year of issue: 2015. Weight: 1500. Color: black. Speed: 157.97";
        assertEquals(expectedString, resultString);
    }
    @Test
    protected void Get() {
        resultString = bmw.get.color();
        expectedString = "black";
        assertEquals(resultString, expectedString);
        resultFloat = bmw.get.speed();
        expectedFloat = 157.97f;
        assertEquals(resultFloat, expectedFloat);
        resultInt = bmw.get.weight();
        expectedInt = 1500;
        assertEquals(resultInt, expectedInt);
        resultString = bmw.get.brand();
        expectedString = "bmw";
        assertEquals(resultString, expectedString);
        resultInt = bmw.get.yearOfIssue();
        expectedInt = 2015;
        assertEquals(resultInt, expectedInt);
        resultString = bmw.get.view();
        expectedString = "Automobile";
        assertEquals(resultString, expectedString);
    }
}