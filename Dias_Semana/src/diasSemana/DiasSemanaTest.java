/**
 * 
 */
package diasSemana;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import notas.Notas;

/**
 * @author vivas
 *
 */
class DiasSemanaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link diasSemana.DiasSemana#main(java.lang.String[])}.
	 */
	@Test
	void testMain() {
		System.out.println("main");
		String[] args = null;
		DiasSemana.main(args);
		
	}

	/**
	 * Test method for {@link diasSemana.DiasSemana#decisionDia(java.util.Scanner)}.
	 */
	@Test
	void testLunes() {
		System.out.println("DiasSemana");
		int n = 1;
		String expResult = "";
		String result ="El día seleccionado es LUNES" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testMartes() {
		System.out.println("DiasSemana");
		int n = 2;
		String expResult = "";
		String result ="El día seleccionado es MARTES" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testMiercoles() {
		System.out.println("DiasSemana");
		int n = 3;
		String expResult = "";
		String result ="El día seleccionado es MIERCOLES" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testJueves() {
		System.out.println("DiasSemana");
		int n = 4;
		String expResult = "";
		String result ="El día seleccionado es JUEVES" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testViernes() {
		System.out.println("DiasSemana");
		int n = 5;
		String expResult = "";
		String result ="El día seleccionado es VIERNES" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testSabado() {
		System.out.println("DiasSemana");
		int n = 6;
		String expResult = "";
		String result ="El día seleccionado es SABADO" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}
	@Test
	void testDomingo() {
		System.out.println("DiasSemana");
		int n = 7;
		String expResult = "";
		String result ="El día seleccionado es DOMINGP" ; 
		assertEquals(expResult, result);
		if (!result.equals(expResult)) {
			fail("Error");
		}
		
	}

}
