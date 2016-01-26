package cragnolini.simone.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import cragnolini.simone.commercialista.LiberoProfessionista;

public class LiberoProfessionistaTest {

	@Test
	public void testCalcolaParcella() {
		
		LiberoProfessionista l = new LiberoProfessionista("Test", "Test", "000", "000", 99);
		//int parcella = l.calcolaParcella();

		//assertEquals(99500, parcella);
		
	}

}
