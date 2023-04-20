/*
 * ÁMBITO DE LOS ATRIBUTOS Y MÉTODOS
 * public: Se puede acceder desde cualquier parte del proyecto
 * private: Sólo se puede acceder desde la clase en la que está declarado
 * default (no poner nada):Se puede acceder desde la clase en la que está declarado y desde las que están en el mismo paquete
 * protected: Se puede acceder desde la clase en la que está declarado, desde las que heredan de esa clase y desde las que están en el mismo paquete
 * */

public abstract class Alumno implements Comparable<Alumno>{
	//Atributos de instacia: datos de cada Alumno
	private String dni; 
	private String nom;
	//String direccion; Ánbioto protected
	//Reserva de memoria para objetos Alumno
	public Alumno() {
		//Constructor por defecto (Reserva memoria)
	}
	
	public Alumno(String dni, String n) {
		//Construcotr específico: Reserva memoria e inicialza los atributos con los valores recibos por parámetro
		this.dni = dni;
		nom = n;
	}
	
	//MÉtodos get: Métodos consultores, nos permiten obtener el valor de un atributo
	//Métodos set: Método modificadores, nos permiten modificar el valor de un atributo
	/*public Alumno() {
		super();
}
	public Alumno(String dni, String nom) {
		super();
		this.dni = dni;
		this.nom = nom;
	}*/
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nom=" + nom + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		/*Devuelve:
		 * <0 si el alumno this es menor que o
		 * >0 si el alumno this es mayor que o
		 * =0 si el alumno this es igual a o*/
		//Ordenar ascendentemente
		return this.nom.compareTo(o.nom);
		//Ordenar descendentemente
		//return o.nom.compareTo(this.nom);
	}
	
	

}
