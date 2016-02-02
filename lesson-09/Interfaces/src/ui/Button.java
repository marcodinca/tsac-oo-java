package ui;

public class Button {

	private String name;
	
	private ButtonCommunicationInterface buttoncommunication;

	public void setButtoncommunication(ButtonCommunicationInterface callback) {
		this.buttoncommunication = callback;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(name);
	}
	

	// metodo chiamato dal sistema quando l'utente preme il pulsante.
	public void pressed() {
		System.out.println(name + " pressed");
		buttoncommunication.onButtonPressed();
		
		
		// button vuole informare chi mi ha creato, o meglio ancora, chi 
		// è interessato che l'utente mi ha selezionato.
	}
	
	
	
}
