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
    Product[] products = new Product[]{first, second, third};

    @Test

    public void shouldSearchBookById () {
        ProductManager manager= new ProductManager(repository);
        repository.save(first);
        repository.save(second);
        repository.save(third);
      String text = "1";
        Product[] expected = new Product[]{third};
        Product[] actual = manager.searchBy("3");

        assertArrayEquals(expected,actual);



    }

}