package com.web.portfolio;

import com.web.portfolio.entity.Classify;
import com.web.portfolio.entity.TStock;
import com.web.portfolio.service.PortfolioService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static PortfolioService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.web.portfolio");
        appContext.refresh();
        service = (PortfolioService) appContext.getBean("portfolioService");
    }
    public static void main(String[] args) {
//        service.getClassifyRepository().save(new Classify("股票", Boolean.TRUE));
//        service.getClassifyRepository().save(new Classify("匯率", Boolean.TRUE));
//        service.getClassifyRepository().save(new Classify("指數", Boolean.FALSE));

//        Classify classify = service.getClassifyRepository().findById(3L).get();
//        TStock tStock = new TStock();
//        tStock.setSymbol("^IXIC");
//        tStock.setName("Nasdaq");
//        tStock.setClassify(classify);
//        service.gettStockRepository().save(tStock);

        //抓單筆
//        Classify classify = service.getClassifyRepository().findById(1L).get();
//        classify.gettStocks().size();
//        System.out.println(classify.gettStocks());
        //抓多筆
        service.getClassifyRepository().findAll().forEach(c->{
            c.gettStocks().size();
            System.out.println(c.getName() + " : " + c.gettStocks());
        });
    }
}
