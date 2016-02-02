package interfaces;

import ui.Button;
import ui.ButtonCommunicationInterface;

class ButtonCommunicatiorB1  implements ButtonCommunicationInterface {
	private MyUIMulti parent;
	public ButtonCommunicatiorB1(MyUIMulti parent) {
		this.parent = parent;
	}
	
	@Override
	public void onButtonPressed() {
		System.out.println("Grazie per avermi (s)premuto ;) da parte di:" 
							+ parent.getMessage());
	}
}

class ButtonCommunicatiorB2  implements ButtonCommunicationInterface {
	private MyUIMulti parent;
	public ButtonCommunicatiorB2(MyUIMulti parent) {
		this.parent = parent;
	}
	
	@Override
	public void onButtonPressed() {
		System.out.println("Sciocchino! da parte di:" 
							+ parent.getMessage());
	}
}

public class MyUIMulti {
	
	private String message;
	
	public MyUIMulti() {
		message = "MyUIMulti.";
	}
	
	void run() {
		
		Button b1 = new Button();
		b1.setName("Click me!");		
		b1.show();
		b1.setButtoncommunication(new ButtonCommunicatiorB1(this));
		
		Button b2 = new Button();
		b2.setName("Non premermi!");		
		b2.show();
		b2.setButtoncommunication(new ButtonCommunicatiorB2(this));
		
		/// codice dell'UI //
		b2.pressed();		
		//b1.pressed();		
	}
	
	String getMessage() {
		return message;
	}
	
	
}
