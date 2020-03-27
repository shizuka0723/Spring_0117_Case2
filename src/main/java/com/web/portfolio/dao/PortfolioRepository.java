package com.web.portfolio.dao;

import com.web.portfolio.entity.Portfolio;
import org.springframework.data.repository.CrudRepository;

public interface PortfolioRepository extends CrudRepository<Portfolio, Long>{
    
}
