package com.web.portfolio;

import com.web.portfolio.entity.Investor;
import com.web.portfolio.entity.Portfolio;
import com.web.portfolio.entity.TStock;
import com.web.portfolio.service.PortfolioService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    static PortfolioService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.web.portfolio");
        appContext.refresh();
        service = (PortfolioService) appContext.getBean("portfolioService");
    }
    public static void main(String[] args) {
        TStock tStock = service.gettStockRepository().findById(2L).get();
        Investor investor = service.getInvestorRepository().findById(1L).get();
        Portfolio portfolio = new Portfolio(273.0, 5000, investor, tStock);
        service.getPortfolioRepository().save(portfolio);
    }
}
