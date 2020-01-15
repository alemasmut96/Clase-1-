package alumnado;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private int matematica;
    private int lengua;
    private int programacion;
    float promedio;
    float resultado;

    
    
    public Alumno(String nombre, String apellido, int legajo, int matematica, int lengua, int programacion) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.legajo = legajo;
    	this.matematica = matematica;
    	this.lengua = lengua;
    	this.programacion = programacion;
    	
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    	
    }
    public String getNombre() {
		return nombre;
	}
    
    public void printNombre() {
    	System.out.println(nombre);
    }

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getMatematica() {
		return matematica;
	}

	public void setMatematica(int matematica) {
		this.matematica = matematica;
	}

	public int getLengua() {
		return lengua;
	}

	public void setLengua(int lengua) {
		this.lengua = lengua;
	}

	public int getProgramacion() {
		return programacion;
	}

	public void setProgramacion(int programacion) {
		this.programacion = programacion;
	}
	public void adeuda() {
		if(lengua <=5) {
			System.out.println("El alumno tiene materias sin aprobar");
		}
		if(matematica <=5) {
			System.out.println("El alumno tiene materias sin aprobar");
		}
		if(programacion <=5) {
			System.out.println("El alumno tiene materias sin aprobar");
		}
	}
	/*public void destacado() {
		if(resultado ==9) {
			System.out.println("Es alumno destacado");
		}
	}*/
	public void aprobado() {
		if( resultado == 5) {
		 System.out.println("El alumno no está aprobado");
		}
		
		else {
			System.out.println("El alumno está aprobado");
		}
	}
 }

 