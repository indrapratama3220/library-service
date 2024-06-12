package service;

import model.dao.BookDao;
import model.entity.Book;

public class AddBookService {

    private BookDao bookDao;

    public AddBookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book){
        bookDao.getBookMap().put(book.getTitle(), book);
        System.out.println("Successfully added book " + book);
    }
}
