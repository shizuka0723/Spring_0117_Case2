package com.web.portfolio;

import com.web.portfolio.service.PortfolioService;
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
            
            
        });
        
    }
}