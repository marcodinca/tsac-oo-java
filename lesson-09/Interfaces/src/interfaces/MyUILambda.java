package interfaces;

import ui.Button;
import ui.ButtonCommunicationInterface;

public class MyUILambda {
	
	private String message;
	
	public MyUILambda() {
		message = "MyUILambda.";	
	}
	
	void run() {
		
		Button b1 = new Button();
		b1.setName("Click me!");		
		b1.show();
		b1.setButtoncommunication(
				() -> System.out.println("Grazie per avermi (s)premuto ;) da parte di: " + message)); 
		
		Button b2 = new Button();
		b2.setName("Non premermi!");		
		b2.show();
		b2.setButtoncommunication(new ButtonCommunicationInterface(){ // body della classe anonima
			@Override
			public void onButtonPressed() {
				System.out.println("Sciocchino! da parte di:" 
									+ message);
			}
		});
		
		/// codice dell'UI //
		b2.pressed();		
		//b1.pressed();		
	}
}
