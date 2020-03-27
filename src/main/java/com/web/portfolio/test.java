package com.web.portfolio;

import java.math.BigDecimal;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class test {

    public static void main(String[] args) throws Exception{
        Stock stock = YahooFinance.get("2330.TW");

        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

        stock.print();
        System.out.println(price);
        System.out.println(change);
        System.out.println(peg);
        System.out.println(dividend);
    }
}
