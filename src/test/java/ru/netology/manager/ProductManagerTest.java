package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository= new ProductRepository();

    @Test

    public void shouldSearchBookByName () {
        ProductManager manager= new ProductManager(repository);
        Product first = new Book();



        Product[] actual = manager.searchBy("A");
        Product[] expected = new Book[]{};


    }

}