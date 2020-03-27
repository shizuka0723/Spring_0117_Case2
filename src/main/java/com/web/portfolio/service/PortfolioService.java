package com.web.portfolio.service;

import com.web.portfolio.dao.ClassifyRepository;
import com.web.portfolio.dao.TStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("portfolioService")
public class PortfolioService {
    @Autowired
    private ClassifyRepository classifyRepository;
    @Autowired
    private TStockRepository tStockRepository;

    public TStockRepository gettStockRepository() {
        return tStockRepository;
    }
    
    
    public ClassifyRepository getClassifyRepository() {
        return classifyRepository;
    }

    
}
