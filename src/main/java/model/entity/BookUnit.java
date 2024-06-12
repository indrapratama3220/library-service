package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookUnit {
    private String bookUnitId;
    private String bookTitle;
    private String rackId;
    private String borrowerId;

    public BookUnit(String bookTitle, String rackId) {
        this.bookTitle = bookTitle;
        this.rackId = rackId;
    }
}
