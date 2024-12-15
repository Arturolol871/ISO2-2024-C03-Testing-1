package com.art;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class ProbarFuncionesTest {

    // Caso 1: Edad -5, esEuropea true, matricularDoctorado true
    @Test
    public void testCaso1() {
        int edad = -5;
        boolean esEuropea = true;
        boolean matricularDoctorado = true;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("Caso no válido: Edad incorrecta", resultado);
    }

    // Caso 2: Edad 17, esEuropea false, matricularDoctorado false
    @Test
    public void testCaso2() {
        int edad = 17;
        boolean esEuropea = false;
        boolean matricularDoctorado = false;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Caso 3: Edad 18, esEuropea true, matricularDoctorado true
    @Test
    public void testCaso3() {
        int edad = 18;
        boolean esEuropea = true;
        boolean matricularDoctorado = true;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("Puede matricularse en el doctorado", resultado);
    }


    // Caso 4: Edad 19, esEuropea false, matricularDoctorado false
    @Test
    public void testCaso4() {
        int edad = 19;
        boolean esEuropea = false;
        boolean matricularDoctorado = false;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Caso 5: Edad -1, esEuropea true, matricularDoctorado false
    @Test
    public void testCaso5() {
        int edad = 19;
        boolean esEuropea = true;
        boolean matricularDoctorado = false;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Caso 6: Edad 0, esEuropea false, matricularDoctorado true
    @Test
    public void testCaso6() {
        int edad = 0;
        boolean esEuropea = false;
        boolean matricularDoctorado = true;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Caso 7: Edad 1, esEuropea true, matricularDoctorado false
    @Test
    public void testCaso16() {
        int edad = 1;
        boolean esEuropea = true;
        boolean matricularDoctorado = false;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Caso 8: Edad 2039, esEuropea false,matricularDoctorado true
    @Test
    public void testCaso8() {
        int edad = 2039;
        boolean esEuropea = false;
        boolean matricularDoctorado = true;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("Caso no válido: Edad incorrecta", resultado);
    }

    // Caso 9: Edad 18, esEuropea true, matricularDoctorado false
    @Test
    public void testCaso9() {
        int edad = 18;
        boolean esEuropea = true;
        boolean matricularDoctorado = false;

        String resultado = Main.generarMensajeMatriculacion(edad, esEuropea, matricularDoctorado);
        assertEquals("No puede matricularse en el doctorado", resultado);
    }

    // Método que simula la lógica del sistema para determinar la matriculación
    @Test
    public void testLeerNombre() {
        String input = "Juan\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String nombre = Main.leerNombre(scanner);
        assertEquals("Juan", nombre);
    }

    @Test
    public void testLeerApellidos() {
        String input = "Pérez\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String apellidos = Main.leerApellidos(scanner);
        assertEquals("Pérez", apellidos);
    }

    @Test
    public void testLeerFechaNacimientoCorrecta() {
        String input = "01-01-2000\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String fechaNacimiento = Main.leerFechaNacimiento(scanner);
        assertEquals("01-01-2000", fechaNacimiento);
    }

    @Test
    public void testLeerNacionalidad() {
        String input = "España\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String nacionalidad = Main.leerNacionalidad(scanner);
        assertEquals("España", nacionalidad);
    }

    @Test
    public void testLeerTitulacionCorrecta() {
        String input = "Master\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String titulacion = Main.leerTitulacion(scanner);
        assertEquals("Master", titulacion);
    }

    @Test
    public void testLeerCertificacionInglesSi() {
        String input = "si\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean certificacionIngles = Main.leerCertificacionIngles(scanner);
        assertTrue(certificacionIngles);
    }

    @Test
    public void testLeerCertificacionInglesNo() {
        String input = "no\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean certificacionIngles = Main.leerCertificacionIngles(scanner);
        assertFalse(certificacionIngles);
    }

    @Test
    public void testLeerTelefonoCorrecto() {
        String input = "123456789\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String telefono = Main.leerTelefono(scanner);
        assertEquals("123456789", telefono);
    }

    @Test
    public void testLeerCorreoElectronicoCorrecto() {
        String input = "juan@example.com\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        String correoElectronico = Main.leerCorreoElectronico(scanner);
        assertEquals("juan@example.com", correoElectronico);
    }
    @Test
    public void testConstructorYGetters() {
        Persona persona = new Persona("Juan", "Pérez", "01-01-2000", "España", "Master", true, "123456789", "juan@example.com");

        assertEquals("Juan", persona.getNombre());
        assertEquals("Pérez", persona.getApellidos());
        assertEquals("01-01-2000", persona.getFechaNacimiento());
        assertEquals("España", persona.getNacionalidad());
        assertEquals("Master", persona.getTitulacion());
        assertTrue(persona.isCertificacionIngles());
        assertEquals("123456789", persona.getTelefono());
        assertEquals("juan@example.com", persona.getCorreoElectronico());
    }

    @Test
    public void testSetters() {
        Persona persona = new Persona("Juan", "Pérez", "01-01-2000", "España", "Master", true, "123456789", "juan@example.com");

        persona.setNombre("Carlos");
        persona.setApellidos("García");
        persona.setFechaNacimiento("15-05-1995");
        persona.setNacionalidad("Francia");
        persona.setTitulacion("Doctorado");
        persona.setCertificacionIngles(false);
        persona.setTelefono("987654321");
        persona.setCorreoElectronico("carlos@example.com");

        assertEquals("Carlos", persona.getNombre());
        assertEquals("García", persona.getApellidos());
        assertEquals("15-05-1995", persona.getFechaNacimiento());
        assertEquals("Francia", persona.getNacionalidad());
        assertEquals("Doctorado", persona.getTitulacion());
        assertFalse(persona.isCertificacionIngles());
        assertEquals("987654321", persona.getTelefono());
        assertEquals("carlos@example.com", persona.getCorreoElectronico());
    }

    @Test
    public void testEsMayorDeEdad() {
        Persona mayor = new Persona("Juan", "Pérez", "01-01-2000", "España", "Master", true, "123456789", "juan@example.com");
        Persona menor = new Persona("Ana", "López", "01-01-2010", "España", "Grado", false, "987654321", "ana@example.com");

        assertTrue(mayor.esMayorDeEdad());
        assertTrue(menor.esMayorDeEdad());
    }

    @Test
    public void testEsMayorDeEdadFechaInvalida() {
        Persona persona = new Persona("Juan", "Pérez", "invalid-date", "España", "Master", true, "123456789", "juan@example.com");

        Exception exception = assertThrows(IllegalArgumentException.class, persona::esMayorDeEdad);
        assertEquals("La fecha de nacimiento no esta en un formato valido. Formato: dd-mm-yyyy", exception.getMessage());
    }

    @Test
    public void testEsEuropea() {
        assertFalse(Persona.esEuropea("España"));
        assertTrue(Persona.esEuropea("Francia"));
        assertFalse(Persona.esEuropea("Brasil"));
        assertTrue(Persona.esEuropea("italia")); // Probando con mayúsculas/minúsculas
    }

    @Test
    public void testMatricularDoctorado() {
        Persona conMaster = new Persona("Juan", "Pérez", "01-01-2000", "España", "Master", true, "123456789", "juan@example.com");
        Persona conDoctorado = new Persona("Ana", "López", "01-01-2000", "España", "Doctorado", false, "987654321", "ana@example.com");
        Persona sinRequisitos = new Persona("Carlos", "García", "01-01-2000", "España", "Grado", true, "456789123", "carlos@example.com");

        assertTrue(conMaster.matricularDoctorado());
        assertTrue(conDoctorado.matricularDoctorado());
        assertFalse(sinRequisitos.matricularDoctorado());
    }
    @Test
    public void testMainWithPreloadedAttributes() {
        // Capturar la salida estándar (System.out)
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Ejecutar el método main
        Main.main(new String[]{});

        // Obtener la salida capturada como String
        String output = outputStream.toString();

        // Verificar que la salida contiene los mensajes esperados
        assertTrue(output.contains("La persona es mayor de edad."));
        assertFalse(output.contains("La persona tiene nacionalidad europea."));
        assertTrue(output.contains("La persona puede matricularse en un doctorado."));
    }
}



