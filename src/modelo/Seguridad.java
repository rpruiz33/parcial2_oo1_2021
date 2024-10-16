package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Seguridad {
private int id;
private LocalDate fecha;
private LocalTime hora;
private Persona Persona;
private boolean entrada;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public Persona getPersona() {
	return Persona;
}
public void setPersona(Persona persona) {
	Persona = persona;
}
public Seguridad(int id, LocalDate fecha, LocalTime hora, Persona persona, boolean entrada) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.hora = hora;
	Persona = persona;
	this.entrada = entrada;
}
public boolean isEntrada() {
	return entrada;
}
public void setEntrada(boolean entrada) {
	this.entrada = entrada;
}



}
