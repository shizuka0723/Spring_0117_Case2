package com.web.portfolio;

import com.web.portfolio.service.PortfolioService;
import java.math.BigDecimal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class App4 {

    static PortfolioService service;

    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.web.portfolio");
        appContext.refresh();
        service = (PortfolioService) appContext.getBean("portfolioService");
    }

    public static void main(String[] args) {
        service.gettStockRepository().findAll().forEach(tstock -> {
            try {
                Stock stock = YahooFinance.get(tstock.getSymbol());
                tstock.setPrice(stock.getQuote().getPrice());
                tstock.setChangePercent(stock.getQuote().getChangeInPercent());
                BigDecimal peg = stock.getStats().getPeg();
                BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
            } catch (Exception e) {
            }
        });

    }
}
