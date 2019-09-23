package io.werkstatt.jrbug;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        ExampleConcrete inst = new ExampleConcrete();

        assertTrue(inst.tester());
    }
}
