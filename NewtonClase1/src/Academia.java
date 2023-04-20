import java.util.ArrayList;
/*Cuando el tipo de dato de una lista es la clase padre de una jerarquía de herencia, en esa lista
 * podemos almacenar objetos de cualquiera de las clases hijas*/
public class Academia {
	private ArrayList<Alumno> listaAlumnos;
	
	public Academia() {
		listaAlumnos = new ArrayList<>();
	}
	
	public void aniadirAlumno(Alumno a) {
		listaAlumnos.add(a);
	}
	
	public void verListaAlumnos() {
		System.out.println("RECORRIENDO CON UN FOR NORMAL...");
		for(int i=0;i<listaAlumnos.size();i++) {
			Alumno a= listaAlumnos.get(i);
			System.out.println(a);
		}
		System.out.println("RECORRIENDO CON UN FOR EACH...");
		for(Alumno a: listaAlumnos) { //Por cada alumno que haya en listaAlumno, haz lo que pongamos dentro del for
			System.out.println(a);
		}
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	
	
}
