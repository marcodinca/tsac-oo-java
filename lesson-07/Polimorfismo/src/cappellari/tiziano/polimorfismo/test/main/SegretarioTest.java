package cappellari.tiziano.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.polimorfismo.main.Segretario;

public class SegretarioTest {

	@Test
	public void testCalcolaStipendio() {
		Segretario s = new Segretario();
		s.setAnzianita(2);
		s.setPagaBase(1000);
		assertEquals(832, s.calcolaStipendio());
	}

}
