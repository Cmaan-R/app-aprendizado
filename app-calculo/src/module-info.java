import br.cmaan.app.Calculadora;
import br.cmaan.app.calculo.CalculadoraImpl;

module app.calculo {
	
	requires transitive app.logging;
	exports br.cmaan.app.calculo;
	
	exports br.cmaan.app.calculo.interno
		to app.financeiro;
	
	opens br.cmaan.app.calculo to app.financeiro;
	
	requires app.api;
	provides Calculadora
		with CalculadoraImpl; 
	
}