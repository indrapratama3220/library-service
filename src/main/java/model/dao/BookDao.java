package model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.entity.Book;

import java.util.Map;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDao {
    private Map<String, Book> bookMap;
}
