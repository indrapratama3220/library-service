import model.dao.BookDao;
import model.dao.BookUnitDao;
import model.entity.Book;
import model.entity.BookUnit;
import service.AddBookService;
import service.AddBookUnitService;
import service.ListBookService;
import service.ListBookUnitService;

import java.util.HashMap;
import java.util.Scanner;

public class LibraryServiceApplication {

    public static void main(String[] args) {
        BookDao bookDao = new BookDao(new HashMap<>());
        BookUnitDao bookUnitDao = new BookUnitDao(new HashMap<>());
        AddBookService addBookService = new AddBookService(bookDao);
        ListBookService listBookService = new ListBookService(bookDao);
        AddBookUnitService addBookUnitService = new AddBookUnitService(bookUnitDao);
        ListBookUnitService listBookUnitService = new ListBookUnitService(bookUnitDao);
        Scanner sc = new Scanner(System.in);

        outer: while (true) {
            System.out.println("\nOPTION");
            System.out.println("1. Add Book");
            System.out.println("2. Get List Book");
            System.out.println("3. Add Book Unit");
            System.out.println("4. Get List Book Unit");
            System.out.println("5. Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Please enter book title");
                    String title = sc.next();
                    System.out.println("Please enter book author");
                    String author = sc.next();
                    System.out.println("Please enter book publisher");
                    String publisher = sc.next();
                    addBookService.addBook(new Book(title, author, publisher));
                    break;
                case 2:
                    System.out.println("Get List of Book");
                    listBookService.getListBook();
                    break;
                case 3:
                    System.out.println("Add Book Unit");
                    System.out.println("Please Enter book title");
                    String bookTitle = sc.next();
                    System.out.println("Please Enter rack id");
                    String rackId = sc.next();
                    BookUnit bookUnit = new BookUnit(bookTitle, rackId);
                    addBookUnitService.addBookUnit(bookUnit);
                    break ;
                case 4:
                    System.out.println("Get List of Book Unit");
                    listBookUnitService.getListBookUnit();
                    break;
                case 5:
                    System.out.println("Exit application, Thanks!");
                    break outer;
            }
        }
    }

}
