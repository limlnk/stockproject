package com.tech.stockproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stockinfo")
public class StockMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stockid;
    @Column(name ="ticker")
    private String ticker;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "market")
    private String market;
    @Column(name = "volume")
    private String volume;
    @Column(name="market_cap")
    private int marketCap;
    @Column(name="trade_date")
    private Date tradeDate;
}
