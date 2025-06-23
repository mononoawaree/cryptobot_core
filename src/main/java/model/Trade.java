package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
// represent one executed trade tick
@Data
//creates public Order()
@NoArgsConstructor
//creates public Order(BigDecimal,BigDecimal)
@AllArgsConstructor
public class Trade {
    private String symbol;
    private String side; // "buy" or "sell"
    private BigDecimal price;
    private BigDecimal amount;
    private long timestamp;
}
