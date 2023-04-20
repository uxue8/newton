
public class AlumnoEmpresa extends Alumno{
	private String nombreEmpresa;

	public AlumnoEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoEmpresa(String dni, String n) {
		super(dni, n);
		// TODO Auto-generated constructor stub
	}

	public AlumnoEmpresa(String dni, String n, String nombreEmpresa) {
		super(dni, n);
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Empresa= "+nombreEmpresa;
	}
}
