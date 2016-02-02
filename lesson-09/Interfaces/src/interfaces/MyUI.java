package interfaces;

import ui.Button;
import ui.ButtonCommunicationInterface;

public class MyUI implements ButtonCommunicationInterface {
	
	
	void run() {
		
		Button b = new Button();
		b.setName("Click me!");		
		b.show();
		b.setButtoncommunication(this);
		
		
		/// codice dell'UI //
		
		
		b.pressed();		
		
	}
	
	@Override
	public void onButtonPressed() {
		System.out.println("Grazie per avermi (s)premuto ;)");
	}

}
