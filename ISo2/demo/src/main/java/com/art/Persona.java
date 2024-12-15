package com.art;
public class Persona {
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String nacionalidad;
	private String titulacion;
	private boolean certificacionIngles;
	private String telefono;
	private String correoElectronico;
	
	public Persona(String nombre, String apellidos, String fechaNacimiento, String nacionalidad, String titulacion,
			boolean certificacionIngles, String telefono, String correoElectronico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.titulacion = titulacion;
		this.certificacionIngles = certificacionIngles;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public boolean isCertificacionIngles() {
		return certificacionIngles;
	}

	public void setCertificacionIngles(boolean certificacionIngles) {
		this.certificacionIngles = certificacionIngles;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
        public boolean esMayorDeEdad() {
	    try {
	        String[] partesFecha = fechaNacimiento.split("-");
	        int anioNacimiento = Integer.parseInt(partesFecha[0]);
	        int anioActual = 2024;
	        return (anioActual - anioNacimiento) >= 18;
	    } catch (NumberFormatException e) {
	        throw new IllegalArgumentException("La fecha de nacimiento no est� en un formato v�lido. Formato: dd-mm-yyyy");
	   }
	}	
	
	public static boolean esEuropea(String nacionalidad) {
        String[] paisesEuropeos = {"Espana", "Francia", "Italia", "Alemania", "Portugal", "Reino Unido", "Suecia",
                                   "Noruega", "Finlandia", "Dinamarca", "Irlanda", "Austria", "Belgica", "Holanda",
                                   "Grecia", "Polonia", "Hungria"};
        for (String pais : paisesEuropeos) {
            if (nacionalidad.equalsIgnoreCase(pais)) {
                return true;
            }
        }
        return false;
    }
	
	public boolean matricularDoctorado() {
        return titulacion.equalsIgnoreCase("Master") || titulacion.equalsIgnoreCase("Doctorado");
    }
	
	
}
