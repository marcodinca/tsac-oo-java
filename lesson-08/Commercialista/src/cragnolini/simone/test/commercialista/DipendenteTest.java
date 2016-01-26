package cragnolini.simone.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import cragnolini.simone.commercialista.Dipendente;

public class DipendenteTest {
	
	@Test
	public void testCalcolaParcella() {
		
		Dipendente d = new Dipendente("Test", "Test", "Test");
		int parcella = d.calcolaParcella();

		assertEquals(50 * 1000, parcella);
		
	}

}
