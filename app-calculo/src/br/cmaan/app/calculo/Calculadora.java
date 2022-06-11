package br.cmaan.app.calculo;

import br.cmaan.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
	
}
