package cappellari.tiziano.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.polimorfismo.main.Sviluppatore;

public class SviluppatoreTest {

	@Test
	public void testCalcoloStipendio() {
		Sviluppatore s = new Sviluppatore();
		
		// metodi classe Base === Dipendente
		s.setNome("Luca");
		s.setCognome("Bianchi");
		s.setAnzianita(3);
		s.setPagaBase(1350);

		// metodi specifici della classe Sviluppatore
		s.setLinguaggiConosciuti(new String[]{"Java"});
		
		assertEquals(1000, s.calcolaStipendio());
		
	}

}
