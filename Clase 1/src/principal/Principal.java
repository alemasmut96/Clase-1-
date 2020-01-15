package principal;

import alumnado.Alumno;

public class Principal {

	public static void main(String[] args) {
		Alumno alumnos = new Alumno("Julieta", "Speranza", 889, 6, 5, 7);
		/*alumnos.setNombre("Juli");
		alumnos.printNombre();
		alumnos.setApellido("Speranza");*/
		//String suApellido = alumnos.getApellido();
		System.out.println("nombre del alumno: "+alumnos.getNombre());
		System.out.println("apellido del alumno: "+alumnos.getApellido());
		System.out.println("N° de legajo: "+alumnos.getLegajo());
		System.out.println("la nota de matemáticas es: "+alumnos.getMatematica());
		System.out.println("la nota de lengua es: "+alumnos.getLengua());
		System.out.println("la nota de programación es: "+alumnos.getProgramacion());
		alumnos.adeuda();
		//alumnos.destacado();
		alumnos.aprobado();
		
		
		//promedio//
		float promedio = alumnos.getMatematica()+alumnos.getLengua()+alumnos.getProgramacion();
		float resultado  =  promedio/3;
		
		System.out.print("El promedio es: "+resultado);
		
		
	}	 
	 
	
}
	

	
