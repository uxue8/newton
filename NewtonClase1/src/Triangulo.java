
public class Triangulo extends Figura {
	private double altura;

	public Triangulo() {
		super();
	}

	public Triangulo(double base) {
		super(base);
	}

	public Triangulo(double base, double altura) {
		super(base);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura/2;
	}
	
}
