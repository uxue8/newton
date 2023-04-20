import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Si el tipo de dato de una variable es una clase, entonces, esa variable es un objeto
		int num; //num no es un objeto porque int no es una clase. num es una variable de tipo simplo
		Alumno a1; //Declaración de una variable de tipo Alumno
		Alumno a2; //a2 es un objeto porque Alumno es una clase
		Alumno a3;
	/*	a1 = new Alumno();
		a2 = new Alumno("111A", "Ana");
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el dni: ");
		String d = sc.nextLine();
		System.out.println("Inserta el nombre: ");
		String n = sc.nextLine();
		a3 = new Alumno(d, n);
		System.out.println("El nombre de a2 es: "+a2.getNom());
		Academia miAcademia = new Academia();
		miAcademia.aniadirAlumno(a2);
		miAcademia.aniadirAlumno(a3);
		miAcademia.verListaAlumnos();
		
		*Ya no podemos crear objetos Alumno porque hemos hecho que sea abstracta
		*/
		
		AlumnoGrado ag = new AlumnoGrado("111A", "Pedro", "DAI");
		AlumnoEmpresa ae = new AlumnoEmpresa("222B", "Eva", "EmpresaE");
		Academia miAcademia = new Academia();
		miAcademia.aniadirAlumno(ag);
		miAcademia.aniadirAlumno(ae);
		miAcademia.verListaAlumnos();
		//Ordenar un arraylist
		Collections.sort(miAcademia.getListaAlumnos());
		System.out.println("Después de ordenar...");
		miAcademia.verListaAlumnos();
		Collections.sort(miAcademia.getListaAlumnos(),Collections.reverseOrder());
		System.out.println("Después de ordenar...");
		miAcademia.verListaAlumnos();
		
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Cuadrado(4));
		figuras.add(new Triangulo(4, 5));
		
		
	}
}
