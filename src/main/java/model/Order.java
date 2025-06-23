package model;

import lombok.*;
import java.math.BigDecimal;
// represent a single price–quantity pair on one side of the book
@Data
//creates public Order()
@NoArgsConstructor
//creates public Order(BigDecimal,BigDecimal)
@AllArgsConstructor
public class Order {
    private BigDecimal price;
    private BigDecimal quantity;
}
