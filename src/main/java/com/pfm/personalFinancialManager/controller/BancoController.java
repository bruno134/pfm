package com.pfm.personalFinancialManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfm.personalFinancialManager.entity.Banco;
import com.pfm.personalFinancialManager.entity.Bandeira;
import com.pfm.personalFinancialManager.entity.CartaoCredito;
import com.pfm.personalFinancialManager.repository.BancoRepository;
import com.pfm.personalFinancialManager.repository.BandeiraRepository;
import com.pfm.personalFinancialManager.repository.CartaoCreditoRepository;

@RestController
public class BancoController {
	
	@Autowired
	private BancoRepository banco;
	
	@Autowired
	private BandeiraRepository bandeira;
	
	@Autowired
	private CartaoCreditoRepository cartao;
	
	@RequestMapping("/listaBanco")
	public List<Banco> listaBancos() {

		return  banco.findAll();

		
	}
	
	@RequestMapping("/listaBandeira")
	public List<Bandeira> listaBandeiras() {

		return  bandeira.findAll();

		
	}
	
	@RequestMapping("/listaCartoes")
	public List<CartaoCredito> listaCartaoCredito() {

		return  cartao.findAll();

		
	}

}
