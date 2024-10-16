package modelo;

public class Visita extends Persona {
@Override
	public String toString() {
		return "Visita [empresa=" + empresa + ", id=" + id + ", apellido=" + apellido + ", Nombre=" + Nombre + ", dni="
				+ dni + "]";
	}

private String empresa;

public String getEmpresa() {
	return empresa;
}

public void setEmpresa(String empresa) {
	this.empresa = empresa;
}

public Visita(int id, String apellido, String nombre, int dni, String empresa) {
	super(id, apellido, nombre, dni);
	this.empresa = empresa;
}

}
