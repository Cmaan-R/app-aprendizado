package br.cmaan.app.calculo;

import br.cmaan.app.calculo.interno.OperacoesAritmeticas;
import br.cmaan.app.logging.Logger;

public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return opAritmeticas.soma(nums);
	}
	
}
