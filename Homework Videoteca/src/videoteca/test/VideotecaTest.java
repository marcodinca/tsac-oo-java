package videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import videoteca.BluRay;
import videoteca.Cassetta;
import videoteca.Dvd;
import videoteca.Film;
import videoteca.Videoteca;

public class VideotecaTest {

	@Test
	public void test() {
		Videoteca video = new Videoteca(new Film[] {
				new Film("Bianco West", "John", 1992, new String[]{"Mio padre", "Tuo padre"}, new Cassetta()),
				new Film("Grigio West", "Ben", 1993, new String[]{"Suo padre", "Suo fratello"}, new Dvd()),
				new Film("Nero West", "Smith", 1994, new String[]{"Un po tutti", "chi manca"}, new BluRay())});
		video.noleggiaFilm("Grigio West", 10);
		video.noleggiaFilm("Bianco West", 3);
		video.noleggiaFilm("Nero West", 5);
		
		assertEquals(30, video.getIncasso());
	}
}
