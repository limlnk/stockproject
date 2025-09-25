package com.tech.stockproject.controller;

import com.tech.stockproject.exception.ResourceNotFoundException;
import com.tech.stockproject.model.StockMember;
import com.tech.stockproject.repository.StockMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/stockmembers")
public class StockController {

    @Autowired
    private StockMemberRepository stockMemberRepository;

    @GetMapping
    private List<StockMember> getAllStockMembers(){
        System.out.println("hihi");
        return stockMemberRepository.findAll();
    }

    @PostMapping
    private StockMember createStockMember(@RequestBody StockMember stockMember){
        return stockMemberRepository.save(stockMember);
    }

    @GetMapping("{id}")
    public ResponseEntity<StockMember> getStockMemberById(@PathVariable long id){
        StockMember stockMember=stockMemberRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Stock not exist With Id:"+id));

        return ResponseEntity.ok(stockMember);
    }

    @PutMapping("{id}")
    public ResponseEntity<StockMember> updateStockMember(@PathVariable long id, @RequestBody StockMember stockMember){
        StockMember updateStockMember=stockMemberRepository
                .findById(id).orElseThrow(()->
                        new ResourceNotFoundException("StockMember not exist with id:"+id));

        updateStockMember.setName(stockMember.getName());
        updateStockMember.setMarket(stockMember.getMarket());
        updateStockMember.setTicker(stockMember.getTicker());
        updateStockMember.setVolume(stockMember.getVolume());
        updateStockMember.setPrice(stockMember.getPrice());
        updateStockMember.setMarketCap(stockMember.getMarketCap());
        updateStockMember.setTradeDate(stockMember.getTradeDate());

        stockMemberRepository.save(updateStockMember);
        return ResponseEntity.ok(updateStockMember);

    }



}
