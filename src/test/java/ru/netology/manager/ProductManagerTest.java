package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
     ProductRepository repository= new ProductRepository();
     Product first = new Product(1, "A", 1);
    Product second = new Product(2, "B", 2);
    Product third = new Product(3, "C", 2);
    Product[] products = new Book[0];
    @Test

    public void shouldSearchBookById () {
        ProductManager manager= new ProductManager(repository);
        repository.save(first);
        repository.save(second);
      repository.save(third);
        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy("A");

        assertEquals(expected,actual);



    }

}