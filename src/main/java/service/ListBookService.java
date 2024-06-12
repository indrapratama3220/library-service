package service;

import model.dao.BookDao;

public class ListBookService {
    private BookDao bookDao;

    public ListBookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void getListBook(){
        bookDao.getBookMap().forEach((k,v) -> {
            System.out.println("Book " + v);
        });
    }
}
