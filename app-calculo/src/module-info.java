module app.calculo {
	
	requires transitive app.logging;
	exports br.cmaan.app.calculo;
	
	exports br.cmaan.app.calculo.interno
		to app.financeiro;
	
	opens br.cmaan.app.calculo to app.financeiro;
	
}