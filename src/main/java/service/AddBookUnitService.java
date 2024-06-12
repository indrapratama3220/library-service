package service;


import model.dao.BookUnitDao;
import model.entity.BookUnit;

import java.util.UUID;

public class AddBookUnitService {

    private BookUnitDao bookUnitDao;

    public AddBookUnitService(BookUnitDao bookUnitDao) {
        this.bookUnitDao = bookUnitDao;
    }

    public void addBookUnit(BookUnit bookUnit) {
        bookUnit.setBookUnitId(UUID.randomUUID().toString());
        bookUnitDao.getBookUnitMap().put(bookUnit.getBookUnitId(), bookUnit);
        System.out.println("Succesfully added book unit");
    }
}
