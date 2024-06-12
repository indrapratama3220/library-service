package service;

import model.dao.BookUnitDao;

public class ListBookUnitService {
    private BookUnitDao bookUnitDao;

    public ListBookUnitService(BookUnitDao bookUnitDao) {
        this.bookUnitDao = bookUnitDao;
    }

    public void getListBookUnit(){
        bookUnitDao.getBookUnitMap().forEach((k,v) -> {
            System.out.println("Book Unit " + v);
        });
    }
}
