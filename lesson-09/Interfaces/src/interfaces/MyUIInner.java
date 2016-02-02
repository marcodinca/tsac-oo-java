package interfaces;

import ui.Button;
import ui.ButtonCommunicationInterface;

public class MyUIInner {
	
	class ButtonCommunicatiorB1  implements ButtonCommunicationInterface {		
		@Override
		public void onButtonPressed() {
			System.out.println("Grazie per avermi (s)premuto ;) da parte di:" 
								+ message);
		}
	}

	class ButtonCommunicatiorB2  implements ButtonCommunicationInterface {
		
		@Override
		public void onButtonPressed() {
			System.out.println("Sciocchino! da parte di:" 
								+ message);
		}
	}
	
	
	
	private String message;
	
	public MyUIInner() {
		message = "MyUIInner.";
	}
	
	void run() {
		
		Button b1 = new Button();
		b1.setName("Click me!");		
		b1.show();
		b1.setButtoncommunication(new ButtonCommunicatiorB1());
		
		Button b2 = new Button();
		b2.setName("Non premermi!");		
		b2.show();
		b2.setButtoncommunication(new ButtonCommunicatiorB2());
		
		/// codice dell'UI //
		b2.pressed();		
		//b1.pressed();		
	}

}
