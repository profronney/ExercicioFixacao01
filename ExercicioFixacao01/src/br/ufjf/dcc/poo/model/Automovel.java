package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo {
	
    @Override
	public double calcularConsumo(double precoLitro) {
		return (this.getCapacidadeTanque()/this.getKmPorLitro())*precoLitro;
	}
	
}
