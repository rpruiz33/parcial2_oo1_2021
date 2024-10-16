package modelo;

public abstract class Persona {
protected int id;
protected String apellido;
protected String Nombre;
protected int dni;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public Persona(int id, String apellido, String nombre, int dni) {
	super();
	this.id = id;
	this.apellido = apellido;
	Nombre = nombre;
	this.dni = dni;
}



}
