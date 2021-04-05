package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{
	
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double raioCm = raio * Math.pow(10, -7);
		double Vc =  Math.pow((2*raioCm*Math.sqrt(2)), 3);
		double Na = 6.023 * Math.pow(10, 23);
		double n = 4;
		return (double) ((n*peso)/(Na*Vc));
	}

}

