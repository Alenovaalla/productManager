package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SmartphoneTest {


    Product smartphone = new Smartphone(1, "A", 5, "Sony");

    @Test
    void shouldMatchesByName() {
        String text = "A";
        assertTrue(smartphone.matches(text));
    }

    @Test
    void shouldMatchesByManufacturer() {
        String text = "Sony";
        assertTrue(smartphone.matches(text));
    }
}