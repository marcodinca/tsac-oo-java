package cappellari.tiziano.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import cappellari.tiziano.polimorfismo.main.Azienda;
import cappellari.tiziano.polimorfismo.main.Dipendente;
import cappellari.tiziano.polimorfismo.main.Manager;
import cappellari.tiziano.polimorfismo.main.Segretario;
import cappellari.tiziano.polimorfismo.main.Sviluppatore;

public class AziendaTest {

	@Test
	public void test() {
		
		Manager m = new Manager();
		m.setAnzianita(10);
		m.setBonus(100);
		m.setPagaBase(10000);
		m.setNome("Mr. Smith");
		m.setCognome("M.");
		
		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1);
		//s.setBonus(100);
		s1.setPagaBase(1200);
		s1.setNome("Marco");
		s1.setCognome("Rossi");
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(5);
		//s.setBonus(100);
		s2.setPagaBase(1300);
		s2.setNome("Gianni");
		s2.setCognome("Rossi");
		
		Segretario s = new Segretario();
		s.setAnzianita(2);
		s.setPagaBase(1000);
		assertEquals(832, s.calcolaStipendio());
		
		Azienda a = new Azienda();
		a.setRagioneSociale("I&I");
		
		// DREAM:
		/*
		Dipendente[] dipendenti = new Dipendente[] {
				null
		};
		a.setDipendenti(dipendenti);
		END DREAM */
		
		a.setManagers(new Manager[]{m});
		a.setSviluppatori(new Sviluppatore[]{s1, s2});
		
		// per gestire il segretario devo:
		// creare metodo set Segretario
		// modificare calcolo totaleStipendi()
		
		// 2000 + 10000 + 10000*2/100 * 10 + 100
		assertEquals(14100, a.totaleStipendi());
	}
	
	@Test
	public void testPolimorfismo() {
		
		Manager m = new Manager();
		m.setAnzianita(10);
		m.setBonus(100);
		m.setPagaBase(10000);
		m.setNome("Mr. Smith");
		m.setCognome("M.");
		
		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1);
		//s.setBonus(100);
		s1.setPagaBase(1200);
		s1.setNome("Marco");
		s1.setCognome("Rossi");
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(5);
		//s.setBonus(100);
		s2.setPagaBase(1300);
		s2.setNome("Gianni");
		s2.setCognome("Rossi");
		
		Segretario segretario = new Segretario();
		segretario.setAnzianita(2);
		segretario.setPagaBase(1000);
		segretario.setOreufficio(4);
		assertEquals(832, segretario.calcolaStipendio());
		
		Azienda a = new Azienda();
		a.setRagioneSociale("I&I");

		
		// POLIMORFISMO: primo fatto
		Dipendente segretarioDipente = segretario;
		// posso trattare gli oggetti di una classe
		// come oggetti della propria classe base
		// trattare === chiamare metodi/usare attributi della classe base
		
		segretarioDipente.getNome();
		//segretarioDipente.setOreufficio(4); // setOreufficio non è un metodo della classe Dipendente
		

		Dipendente[] dipendenti = new Dipendente[] {
				segretarioDipente,
				m,  // Manager
				s1, // Sviluppatore
				s2  // Sviluppatore
		};
		a.setDipendenti(dipendenti);
		
		
		
		// 2000 + 10000 + 10000*2/100 * 10 + 100
		assertEquals(14100, a.totaleStipendiPolimorfismo());
	}
	
	@Test
	public void testPolimorfismoNew() {
		
		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1);
		//s.setBonus(100);
		s1.setPagaBase(1200);
		s1.setNome("Marco");
		s1.setCognome("Rossi");
		s1.setLinguaggiConosciuti(new String[]{"C++"});
		
		Dipendente d = s1; //up casting
		// sarebbe OK a runtime, ma NO a compile time!!
		// un dipendente non ha il metodo setLinguaggiConosciuti
		// d.setLinguaggiConosciuti(new String[]{"Java"});
		
		
		// e se volessi tornare indietro e trattare il dipendente d come un
		// Sviluppatore?
		Sviluppatore s2 = (Sviluppatore)d; // down casting => ATTENZIONE!
		
		// check se il tipo è Sviluppatore.
		if (d instanceof Sviluppatore) {
			// OK, sono tranquillo
			Sviluppatore s3 = (Sviluppatore)d;
			assertTrue(s1 == s3);
		}
		
		assertTrue(s1 == d && s1 == s2);
		
	}

}
