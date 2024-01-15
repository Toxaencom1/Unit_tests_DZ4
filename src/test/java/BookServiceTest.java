import com.taxah.unit_test.book.Book;
import com.taxah.unit_test.book.BookRepository;
import com.taxah.unit_test.book.BookService;

import com.taxah.unit_test.book.InMemoryBookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/*

Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */
class BookServiceTest {

    BookRepository bookRepositoryMock;
    BookService bookService;


    @BeforeEach
    void setup() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void testFakeRepository() {
        /*
            так как InMemoryBookRepository уже является Fake имитирующий базу данных
            его не проверяем на корректность данных
        */
    }

    @Test
    void testFindBookById() {
        Book book = new Book("1", "Book1", "Author1");
        when(bookRepositoryMock.findById("1")).thenReturn(book);
        Book res = bookService.findBookById("1");

        verify(bookRepositoryMock, times(1)).findById("1");
        assertEquals(book, res);
    }

    @Test
    void testFindAllBooks() {
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1); bookList.add(book2);
        when(bookRepositoryMock.findAll()).thenReturn(bookList);

        List<Book> resList = bookService.findAllBooks();
        verify(bookRepositoryMock, times(1)).findAll();
        assertEquals(bookList, resList);
    }
}