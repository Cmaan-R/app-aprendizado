package br.cmaan.app.calculo;

import br.cmaan.app.Calculadora;
import br.cmaan.app.calculo.interno.OperacoesAritmeticas;
import br.cmaan.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	private String id = "abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
	
	
	
	
}
