package com.web.portfolio.dao;

import com.web.portfolio.entity.Investor;
import org.springframework.data.repository.CrudRepository;

public interface InvestorRepository extends CrudRepository<Investor, Long>{
    
}
