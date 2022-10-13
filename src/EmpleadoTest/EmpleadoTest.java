package EmpleadoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Empleado.Empleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void encargadoTest() {
		float esperado = 2500;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 100, 0);
		assertEquals(esperado, resultado);
	}

	@Test
	void vendedorTest() {
		float esperado = 2000;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 100, 0);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void primaTest1() {
		float esperado = 2600;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 1000, 0);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void primaTest2() {
		float esperado = 2700;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 1500, 0);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void primaTest0() {
		float esperado = 2500;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 100, 0);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void extraTest() {
		float esperado = 2650;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 0, 5);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void noExtraTest() {
		float esperado = 2500;
		float resultado = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 0, 0);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void nominaTest0() {
		float esperado = 2000;
		float resultado = Empleado.calculoNominaNeta(2000);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void nominaTest15() {
		float esperado = 1870;
		float resultado = Empleado.calculoNominaNeta(2200);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void nominaTest18() {
		float esperado = 2050;
		float resultado = Empleado.calculoNominaNeta(2500);
		assertEquals(esperado, resultado);
	}
}
