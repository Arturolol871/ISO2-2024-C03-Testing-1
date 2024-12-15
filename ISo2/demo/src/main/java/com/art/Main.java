package com.art;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		 // Atributos precargados
		 String nombre = "Juan";
		 String apellidos = "Pérez";
		 String fechaNacimiento = "01-01-2000"; // Formato dd-mm-yyyy
		 String nacionalidad = "España";
		 String titulacion = "Master";
		 boolean certificacionIngles = true;  // Asumiendo que tiene certificación
		 String telefono = "123456789";
		 String correoElectronico = "juan@example.com";
 
		 // Creando una persona con los atributos precargados
		 Persona persona = new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, titulacion, certificacionIngles, telefono, correoElectronico);
 

		
		System.out.println("");
		if (persona.esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad.");
		} else {
			System.out.println("La persona NO es mayor de edad.");
		}

		if (Persona.esEuropea(persona.getNacionalidad())) {
			System.out.println("La persona tiene nacionalidad europea.");
		} else {
			System.out.println("La persona NO tiene nacionalidad europea.");
		}
		
		if (persona.matricularDoctorado()) {
	        System.out.println("La persona puede matricularse en un doctorado.");
	    } else {
	        System.out.println("La persona NO puede matricularse en un doctorado.");
	    }
	}

	public static Persona crearPersona(Scanner sc) {
		String nombre = leerNombre(sc);
		String apellidos = leerApellidos(sc);
		String fechaNacimiento = leerFechaNacimiento(sc);
		String nacionalidad = leerNacionalidad(sc);
		String titulacion = leerTitulacion(sc);
		boolean certificacionIngles = leerCertificacionIngles(sc);
		String telefono = leerTelefono(sc);
		String correoElectronico = leerCorreoElectronico(sc);

		Persona persona = new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, titulacion, certificacionIngles,
				telefono, correoElectronico);

		return persona;
	}

	public static String leerNombre(Scanner sc) {
		String nombre;
		do {
			System.out.print("Introduce el nombre: ");
			nombre = sc.nextLine().trim();

			if (nombre.isEmpty()) {
				System.out.println("El nombre no puede estar vac�o.");
			} else if (nombre.matches(".*\\d.*")) {
				System.out.println("El nombre no puede contener n�meros.");
			} else {
				break;
			}

		} while (true);

		return nombre;
	}

	public static String leerApellidos(Scanner sc) {
		String apellidos;
		do {
			System.out.print("Introduce los apellidos: ");
			apellidos = sc.nextLine().trim();

			if (apellidos.isEmpty()) {
				System.out.println("Los apellidos no pueden estar vac�os.");
			} else if (apellidos.matches(".*\\d.*")) {
				System.out.println("Los apellidos no pueden contener n�meros.");
			} else {
				break;
			}

		} while (true);

		return apellidos;
	}

	public static String leerFechaNacimiento(Scanner sc) {
		String fechaNacimiento;
		do {
			System.out.print("Introduce la fecha de nacimiento (DD-MM-YYYY): ");
			fechaNacimiento =  sc.nextLine().trim();

			// formato de la fecha DD-MM-YYYY
			if (!fechaNacimiento.matches("\\d{2}-\\d{2}-\\d{4}")) {
				System.out.println("El formato de la fecha debe ser DD-MM-YYYY.");
			} else {
				String[] partes = fechaNacimiento.split("-");
				int dia = Integer.parseInt(partes[0]);
				int mes = Integer.parseInt(partes[1]);
				int anio = Integer.parseInt(partes[2]);

				if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900 || anio > 2024) {
					System.out.println("La fecha introducida no es v�lida.");
				} else {
					// Verificar si la fecha no es futura
					if (anio == 2024 && (mes > 12 || (mes == 12 && dia > 31))) {
						System.out.println("La fecha de nacimiento no puede ser futura.");
					} else {
						break;
					}
				}
			}

		} while (true);

		return fechaNacimiento;
	}

	public static String leerNacionalidad(Scanner sc) {
		String nacionalidad;
		do {
			System.out.print("Introduce la nacionalidad: ");
			nacionalidad =  sc.nextLine().trim();

			if (nacionalidad.isEmpty()) {
				System.out.println("La nacionalidad no puede estar vac�a.");
			} else {
				break;
			}

		} while (true);

		return nacionalidad;
	}

	public static String leerTitulacion(Scanner sc) {
		String titulacion;
		String[] titulacionesValidas = { "Grado", "Master", "Doctorado" };
		boolean esValida = false;
		do {
			System.out.print(
					"Introduce la titulaci�n (Grado, Master, Doctorado): ");
			titulacion =  sc.nextLine().trim();

			for (String titulo : titulacionesValidas) {
				if (titulacion.equalsIgnoreCase(titulo)) {
					esValida = true;
					break;
				}
			}

			if (!esValida) {
				System.out.println(
						"La titulaci�n introducida no es v�lida. Debe ser una de las siguientes: Primaria, Secundaria, Bachillerato, Grado, Master, Doctorado.");
			}

		} while (titulacion == null || titulacion.isEmpty() || esValida == false);

		return titulacion;
	}

	public static boolean leerCertificacionIngles(Scanner sc) {
		String respuesta;
		boolean tieneCertificacion = false;
            OUTER:
            do {
                System.out.print("Tiene certificacion de ingles? (si/no): ");
                respuesta = sc.nextLine().trim().toLowerCase();
                switch (respuesta) {
                    case  "si" -> {
                        tieneCertificacion = true;
                        break OUTER;
                        }
                    case "no" -> {
                        tieneCertificacion = false;
                        break OUTER;
                        }
                    default -> System.out.println("Por favor, introduce una respuesta v�lida (s�/no).");
                }
            } while (true);

		return tieneCertificacion;
	}

	public static String leerTelefono(Scanner sc) {
		String telefono;
		do {
			System.out.print("Introduce el n�mero de tel�fono (9 d�gitos): ");
			telefono =  sc.nextLine().trim();

			// Verificar que el tel�fono tenga 9 d�gitos y que contenga solo n�meros
			if (telefono.length() != 9) {
				System.out.println("El n�mero de tel�fono debe tener 9 d�gitos.");
			} else if (!telefono.matches("\\d{9}")) {
				System.out.println("El n�mero de tel�fono debe contener solo n�meros.");
			} else {
				break;
			}
		} while (true);

		return telefono;
	}

	public static String leerCorreoElectronico(Scanner sc) {
		String correoElectronico;
		do {
			System.out.print("Introduce el correo electr�nico: ");
			correoElectronico =  sc.nextLine().trim();

			// Verificar que el correo tenga un formato v�lido
			if (!correoElectronico.matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$")) {
				System.out.println("El correo electr�nico no es v�lido.");
			} else {
				break;
			}
		} while (true);

		return correoElectronico;
	}

}