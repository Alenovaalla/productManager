package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {

    Product book = new Book(1, "A", 5, "Толстой");

    @Test
    void shouldMatchesByName() {
        String text = "A";
        assertTrue(book.matches(text));
    }

    @Test
    void shouldMatchesByAuthor() {
        String text = "Толстой";
        assertTrue(book.matches(text));
    }
}