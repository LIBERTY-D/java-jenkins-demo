package com.demo.apps;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Runs ONCE before all tests");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs AFTER each test");
    }

    @Test
    void calcTest() {
        int result = Main.calc(5, 5);

        assertEquals(10, result);
    }

    @Test
    void calcWithNegativeNumbersTest() {
        int result = Main.calc(-5, 10);

        assertEquals(5, result);
    }

    @Test
    void calcWithZeroTest() {
        int result = Main.calc(0, 10);

        assertEquals(10, result);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Runs ONCE after all tests");
    }

}
