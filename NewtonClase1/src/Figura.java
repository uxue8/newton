
public abstract class Figura {
	protected double base;

	public Figura() {
	}

	public Figura(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	//Método que devuelve el área de una figura
	public abstract double calcularArea();
	
}
