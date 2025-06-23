package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

//wraps all the bids and asks for a symbol at one moment, plus a timestamp
@Data
//creates public OrderBook()
@NoArgsConstructor
//creates public OrderBook(String, Order[], Order[], long)
@AllArgsConstructor
public class OrderBook {
    private String symbol;
    private ArrayList<Order> bids;
    private ArrayList<Order> asks;
    private long timestamp;
}
