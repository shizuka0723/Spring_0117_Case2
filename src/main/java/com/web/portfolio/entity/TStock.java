package com.web.portfolio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tstock")
public class TStock implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "symbol") 
    private String symbol; // 商品代號
    
    @Column(name = "name")
    private String name; // 商品名稱
    
    //以下是報價資料
    @Column(name = "preClosed")
    private BigDecimal preClosed; // 昨收(T-1)
    
    @Column(name = "price")
    private BigDecimal price; // 最新價格
    
    @Column(name = "changePrice")
    private BigDecimal changePrice; // 漲跌
    
    @Column(name = "changePercent")
    private BigDecimal changePercent; // 漲跌幅
    
    @Column(name = "volumn")
    private Long volumn; // 交易量
    
    @Column(name = "transactionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate; // 交易日期
    
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "classify_id",referencedColumnName = "id")
//    @JsonIgnoreProperties("tStocks")
    private Classify classify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPreClosed() {
        return preClosed;
    }

    public void setPreClosed(BigDecimal preClosed) {
        this.preClosed = preClosed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(BigDecimal changePrice) {
        this.changePrice = changePrice;
    }

    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
    }

    public Long getVolumn() {
        return volumn;
    }

    public void setVolumn(Long volumn) {
        this.volumn = volumn;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "TStock{" + "id=" + id + ", symbol=" + symbol + ", name=" + name + ", preClosed=" + preClosed + ", price=" + price + ", changePrice=" + changePrice + ", changePercent=" + changePercent + ", volumn=" + volumn + ", transactionDate=" + transactionDate + '}';
    }
    
}
