package com.tech.stockproject;

import com.tech.stockproject.model.StockMember;
import com.tech.stockproject.repository.StockMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StockprojectApplication.class, args);
	}

    @Autowired
    private StockMemberRepository stockMemberRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
