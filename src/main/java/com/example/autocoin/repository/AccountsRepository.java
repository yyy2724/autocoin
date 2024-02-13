package com.example.autocoin.repository;

import com.example.autocoin.entity.autocoin.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsEntity, Long> {


    
}
