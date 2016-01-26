package videoteca;

public class ProvaVideoteca {
	public static void main(String[] args) {
		Videoteca video = new Videoteca(new Film[] {
				new Film("Bianco West", "John", 1992, new String[]{"Mio padre", "Tuo padre"}, new Cassetta()),
				new Film("Grigio West", "Ben", 1993, new String[]{"Suo padre", "Suo fratello"}, new Dvd()),
				new Film("Nero West", "Smith", 1994, new String[]{"Un po tutti", "chi manca"}, new BluRay())});
		
		video.noleggiaFilm("Grigio West", 10);
		video.noleggiaFilm("Bianco West", 3);
		video.noleggiaFilm("Nero West", 5);
		
		System.out.println("Incasso totale: "+video.getIncasso()+"€");
	}
}
