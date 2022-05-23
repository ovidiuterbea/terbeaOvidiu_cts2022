package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CnpInvalidException;
import clase.Persoana;

public class TestGetSex {

	@Test
	public void testRightM() {
		Persoana persoana = new Persoana("Andrei","5000509410016");
		assertEquals("M",persoana.getSex());
	}

	@Test
	public void testBoundaryInferior() {
		Persoana persoana = new Persoana("Andrei","1000509410016");
		assertEquals("M",persoana.getSex());
	}
	
	@Test
	public void testBoundarySuperior() {
		Persoana persoana = new Persoana("Andrei","6000509410016");
		assertEquals("F",persoana.getSex());
	}
	
	@Test
	public void testCrossCheck() {
		Persoana persoana = new Persoana("Andrei","6000509410016");
		int cifra = persoana.CNP.charAt(0);
		assertEquals(cifra%2 != 0 ? "M" : "F",persoana.getSex());
	}
	
	@Test(expected = CnpInvalidException.class)
	public void testError() {
		Persoana persoana = new Persoana("Andrei","0000509410016");
		persoana.getSex();
	}
	
	@Test(expected = CnpInvalidException.class)
	public void testErrorConsoana() {
		Persoana persoana = new Persoana("Andrei","B000509410016");
		persoana.getSex();
	}
	
	@Test(timeout = 100)
	public void testPerformanceGetSex() {
		Persoana persoana = new Persoana("Andrei","2000509410016");
		persoana.getSex();
	}
	
	@Test
	public void formatGetSexTest() {
		Persoana persoana = new Persoana("Andrei","1000509410016");
		assertEquals(1,persoana.getSex().length());
	}
	
	@Test
	public void testInterval() {
		Persoana persoana = new Persoana("Andrei","7000509410016");
		assertEquals("N/A",persoana.getSex());
	}
	
	@Test
	public void testExistenceGetSex() {
		Persoana persoana = new Persoana();
		persoana.getSex();
	}
	
	
}
