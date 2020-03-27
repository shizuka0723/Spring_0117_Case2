package com.web.portfolio;

import com.web.portfolio.entity.Classify;
import com.web.portfolio.entity.Investor;
import com.web.portfolio.entity.TStock;
import com.web.portfolio.entity.Watch;
import com.web.portfolio.service.PortfolioService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    static PortfolioService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.web.portfolio");
        appContext.refresh();
        service = (PortfolioService) appContext.getBean("portfolioService");
    }
    public static void main(String[] args) {
        Investor investor = new Investor("Haruka", "1234", "aaa", 1_000_000);
        service.getInvestorRepository().save(investor);
        Watch watch = new Watch("我的投資組合", investor);
        service.getWatchRepository().save(watch);
    }
}
