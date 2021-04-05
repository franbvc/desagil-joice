package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	
	public CalculadoraCCC() {
		super("CCC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double raioCm = raio * Math.pow(10, -7);
		double Vc =  Math.pow((4*raioCm / Math.sqrt(3)), 3);
		double Na = 6.023 * Math.pow(10, 23);
		double n = 2;
		return (double) ((n*peso)/(Na*Vc));
	}

}