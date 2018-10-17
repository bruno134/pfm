package com.pfm.personalFinancialManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pfm.personalFinancialManager.entity.Banco;

public interface BancoRepository extends JpaRepository<Banco, Integer>{

}
