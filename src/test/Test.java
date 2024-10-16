package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import modelo.Seguridad;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema s=new Sistema();
		System.out.println(s.agregarVisita("Molina", "Rocio", 22222222, "unla"));
		System.out.println(s.agregarEmpleado("Lopez", "Martin", 33333333, 3829));
		System.out.println(s.agregarVisita("Marino","Marcelo", 44444444, "Coop TIC"));
		System.out.println(s.agregarEmpleado("Rodriguez", "Lucia",11111111, 3840));
	    System.out.println(s.traerPersona(1));	
	
	    try {
			System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,26), LocalTime.of(7, 50), true ,s.traerPersona(1)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,26), LocalTime.of(8, 0), true,s.traerPersona(2)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,26), LocalTime.of(18, 10), false ,s.traerPersona(1)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,26), LocalTime.of(18,20), false ,s.traerPersona(2)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,27), LocalTime.of(9, 0), true ,s.traerPersona(3)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,27), LocalTime.of(9, 10), true ,s.traerPersona(4)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,27), LocalTime.of(18, 10), false ,s.traerPersona(3)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    try {
				System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,27), LocalTime.of(18, 20), false ,s.traerPersona(4)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    System.out.println(s.getLstSeguridad());
	    System.out.println(s.traerSeguridad(LocalDate.of(2021,8,27),s.traerPersona(4)));
	    try {
					System.out.println(s.agregarSeguridad(LocalDate.of(2021,8,27), LocalTime.of(18, 25), false ,s.traerPersona(4)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    System.out.println(s.traerVisitas(LocalDate.of(2021, 8, 26)));
	}


}
