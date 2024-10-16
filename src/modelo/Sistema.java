package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Persona> lstPersonas;
private List<Seguridad> lstSeguridad;
public List<Persona> getLstPesonas() {
	return lstPersonas;
}
public void setLstPesonas(List<Persona> lstPersonas) {
	this.lstPersonas = lstPersonas;
}
public List<Seguridad> getLstSeguridad() {
	return lstSeguridad;
}
public void setLstSeguridad(List<Seguridad> lstSeguridad) {
	this.lstSeguridad = lstSeguridad;
}
public Sistema() {
	super();
	this.lstPersonas = new ArrayList<Persona>();
	this.lstSeguridad = new ArrayList<Seguridad>();
}
public boolean agregarEmpleado(String apellido, String nombre , int dni, int nroLegajo) {
	int id=1;
	if(lstPersonas.size()>0) {
		id=(lstPersonas.get(lstPersonas.size()-1).getId()+1);
	}
	return lstPersonas.add(new Empleado(id,apellido, nombre ,dni, nroLegajo));
}
public boolean agregarVisita(String apellido, String nombre , int dni, String empresa) {
	int id=1;
	if(lstPersonas.size()>0) {
		id=(lstPersonas.get(lstPersonas.size()-1).getId()+1);
	}
	return lstPersonas.add(new Visita(id,apellido, nombre ,dni, empresa));
}
public Persona traerPersona(int id) {
	Persona p=null;
	int i=0;
	while (i<lstPersonas.size()&& p==null) {
		if(lstPersonas.get(i).getId()==id) {
			p=lstPersonas.get(i);
		}
		i++;
	}
	return p;
}
public 	List<Seguridad> traerSeguridad(LocalDate fecha,Persona persona) {
	List<Seguridad> p=new ArrayList<Seguridad>();
	
		for(int i=0;i<lstSeguridad.size();i++) {
		if(lstSeguridad.get(i).isEntrada()) {
			
			p.add(lstSeguridad.get(i));
		}
		
	}
	return p;
}
}
