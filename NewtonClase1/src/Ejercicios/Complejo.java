package Ejercicios;


public class Complejo {
	
	
		private double real;
		private double imaginaria;
		
		
		public Complejo() {
			
		}
		
		public Complejo(double r, double i) {
			this.real = r;
			this.imaginaria = i;
		}
		public Complejo(double r) {
			this.real = r;
		}
	
		public Complejo(Complejo c) {
			this.real = c.real;
			this.imaginaria = c.imaginaria;
		}
	
		@Override
		public String toString() {
			return (real + " + " + imaginaria + "i");
		}
		
		public double getReal() {
			return real;
		}
		public void setReal(double real) {
			this.real = real;
		}
		public double getImaginaria() {
			return imaginaria;
		}
		public void setImaginaria(double imaginaria) {
			this.imaginaria = imaginaria;
		}
		
}
