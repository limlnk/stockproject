package com.tech.stockproject.repository;

import com.tech.stockproject.model.StockMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMemberRepository extends JpaRepository<StockMember,Long> {
}
