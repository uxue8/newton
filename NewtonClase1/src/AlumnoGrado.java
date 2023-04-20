/*Se hereda todo (independientemente del ámbito), excepto los constructores*/
public class AlumnoGrado extends Alumno{
	private String grado;

	public AlumnoGrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoGrado(String dni, String n) {
		super(dni, n);
		// TODO Auto-generated constructor stub
	}

	public AlumnoGrado(String dni, String n, String grado) {
		super(dni, n);
		this.grado = grado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public String toString() {
		return "AlumnoGrado [grado=" + grado + ", Dni=" + getDni() + ", Nom=" + getNom() + "]";
	}
	
}
