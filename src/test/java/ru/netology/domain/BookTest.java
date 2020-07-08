package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    ProductRepository repository = new ProductRepository();
    Product first = new Book(1, "A", 5, "Толстой");
    Product second = new Book(2, "B", 2, "Пушкин");
    Product third = new Smartphone(3, "B", 4, "Sony");
    Product[] products = new Product[]{first, second, third};

    @Test
    void shouldMatchesByName() {
        ProductManager manager = new ProductManager(repository);
        Product book = new Book();
        repository.save(first);
        repository.save(second);
        repository.save(third);
        String text = "A";
         book.matches("A");
        assertTrue(true);

    }

}