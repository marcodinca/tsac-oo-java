package cappellari.tiziano.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.polimorfismo.main.Dipendente;

public class DipendenteTest {

	@Test
	public void testCalcolaStipendi() {
		Dipendente d = new Dipendente();
		d.setNome("Marco");
		d.setCognome("Rossi");
		d.setAnzianita(5);
		d.setPagaBase(1000);
		
		//d.setLinguaggiConosciuti(new String[]{"Java"}); metodo della classe Sviluppatore, non Dipendente.
		
		assertEquals(1100, d.calcolaStipendio());
	}

}
