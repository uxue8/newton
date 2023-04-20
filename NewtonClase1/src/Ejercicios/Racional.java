package Ejercicios;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional() {
		this.numerador=0;
		this.denominador=0;
	}
	
	public Racional (Racional r){
		this.numerador = r.numerador;
		this.denominador = r. denominador;
		}

	public Racional (int n, int d){
		this.numerador = n;
		this.denominador = d;
	}

	@Override
	public String toString() {
	return numerador + "/" + denominador ;
	}

}
