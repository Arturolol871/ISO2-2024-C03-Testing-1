package com.ejemplo.problema1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class ProbarFuncionesTest {

    @Test
    void testEsMayorDeEdad() {
        assertFalse(esMayorDeEdad(-5));
        assertFalse(esMayorDeEdad(0));
        assertFalse(esMayorDeEdad(17));
        assertTrue(esMayorDeEdad(18));
        assertTrue(esMayorDeEdad(19));
        assertTrue(esMayorDeEdad(2039));
    }

    private void assertTrue(boolean esMayorDeEdad) {
		// TODO Auto-generated method stub
		
	}

	private void assertFalse(boolean esMayorDeEdad) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testEsEuropea() {
        assertTrue(esEuropea("España"));
        assertTrue(esEuropea("Francia"));
        assertFalse(esEuropea("México"));
        assertFalse(esEuropea("China"));
    }

    @Test
    void testMatricularDoctorado() {
        assertTrue(matricularDoctorado("Master"));
        assertTrue(matricularDoctorado("Doctorado"));
        assertFalse(matricularDoctorado("Licenciatura"));
        assertFalse(matricularDoctorado("Diplomado"));
    }

    @Test
    void testCombinatoriaMaxima() {
        assertTrue(validarCombinacion(18, true, true));
        assertFalse(validarCombinacion(17, false, false));
    }

    @Test
    void testEachUse() {
        assertFalse(validarCombinacion(-5, true, true)); // La edad negativa siempre será inválida
        assertFalse(validarCombinacion(17, false, false)); // Edad menor de 18 no es válida
        assertTrue(validarCombinacion(18, true, false)); // Válida si es europea
        assertTrue(validarCombinacion(18, false, true)); // Válida si tiene doctorado
        assertFalse(validarCombinacion(18, false, false)); // No válida si no cumple ninguna condición
    }
    @Test
    void testPairwise() {
        assertFalse(validarCombinacion(-5, true, true)); // Edad negativa siempre inválida
        assertTrue(validarCombinacion(18, true, true));  // Edad válida con ambas condiciones
        assertTrue(validarCombinacion(18, true, false)); // Edad válida si es europea
        assertTrue(validarCombinacion(18, false, true)); // Edad válida si tiene doctorado
        assertFalse(validarCombinacion(18, false, false)); // No válida si no cumple ninguna condición
    }

    private boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    private boolean esEuropea(String nacionalidad) {
        String[] listaPaises = {"España", "Francia", "Italia"};
        for (String pais : listaPaises) {
            if (pais.equalsIgnoreCase(nacionalidad)) {
                return true;
            }
        }
        return false;
    }

    private boolean matricularDoctorado(String titulacion) {
        return "Master".equalsIgnoreCase(titulacion) || "Doctorado".equalsIgnoreCase(titulacion);
    }

    private boolean validarCombinacion(int edad, boolean europea, boolean doctorado) {
        if (edad < 18) {
            return false; // Si la edad es menor de 18, no es válida
        }
        // Si tiene cualquiera de las condiciones válidas
        return europea || doctorado;
    }
}
