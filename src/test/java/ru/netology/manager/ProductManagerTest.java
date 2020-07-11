package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    Product first = new Book(1, "A", 5, "Толстой");
    Product second = new Book(2, "B", 2, "Пушкин");
    Product third = new Smartphone(3, "C", 4, "Sony");

    @Test

    public void shouldSearchByNameBook() {
        ProductManager manager = new ProductManager(repository);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy("A");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAutorBook() {
        ProductManager manager = new ProductManager(repository);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy("Толстой");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneName() {
        ProductManager manager = new ProductManager(repository);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        Product[] expected = new Product[]{third};
        Product[] actual = manager.searchBy("C");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneManufacturer() {
        ProductManager manager = new ProductManager(repository);
        repository.save(first);
        repository.save(second);
        repository.save(third);
        Product[] expected = new Product[]{third};
        Product[] actual = manager.searchBy("Sony");

        assertArrayEquals(expected, actual);
    }



}