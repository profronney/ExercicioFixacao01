package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Automovel;
import br.ufjf.dcc.poo.model.Caminhao;

public class Principal {

	public static void main(String[] args) {
		Automovel automovel = new Automovel();
		automovel.setMarca("Mercedes");
		automovel.setKmPorLitro(15f);
		automovel.setCapacidadeTanque(55);
		System.out.println("Valor do consumo automóvel: " + 
		automovel.calcularConsumo(5.11f));
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Volvo");
		caminhao.setCapacidadeTanque(100);
		caminhao.setKmPorLitro(13);
		caminhao.setTara(1500);
		System.out.println("Valor do consumo caminhão: " +
		caminhao.calcularConsumo(5.11));
	
	}

}
