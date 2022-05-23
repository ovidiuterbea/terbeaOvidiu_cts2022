package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CnpInvalidException;
import clase.Persoana;

public class TestGetVarsta {

	@Test
	public void testRightV() {
		Persoana persoana = new Persoana("Andrei","5000509410016");
		assertEquals(21, persoana.getVarsta());
	}
	
	@Test
	public void testBoundaryInferiorVarsta() {
		Persoana persoana = new Persoana("Andrei","3000101410016");
		assertEquals(222,persoana.getVarsta());
	}
	
	@Test
	public void testBoundarySuperiorVarsta() {
		Persoana persoana = new Persoana("Andrei","5220101410016");
		assertEquals(0,persoana.getVarsta());
	}
	
	@Test(expected = CnpInvalidException.class)
	public void testErrorVarsta() {
		Persoana persoana = new Persoana("Andrei","5250101410016");
		persoana.getVarsta();
	}
	
	@Test(timeout = 100)
	public void testPerformanceVarsta() {
		Persoana persoana = new Persoana("Andrei","5000509410016");
		persoana.getVarsta();
	}
	
	@Test
	public void testFormatVarsta() {
		Persoana persoana = new Persoana("Andrei","5000509410016");
		assertTrue(persoana.getVarsta() >= 0);
	}
	
	@Test
	public void testOrdineVarsta() {
		Persoana persoana1 = new Persoana("Andrei","5000509410016");
		Persoana persoana2 = new Persoana("Ovidiu","1980509410016");
		assertTrue(persoana2.getVarsta() > persoana1.getVarsta());
	}
	
	@Test
	public void testExistenceVarsta() {
		Persoana persoana1 = new Persoana();
		persoana1.getVarsta();
	}

}
