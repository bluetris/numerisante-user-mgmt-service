package com.numerisante.usermgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.order.service.orderservice.entity.User;

@Repository
public interface UsermgmtRepository extends JpaRepository<User, String>{
    
}