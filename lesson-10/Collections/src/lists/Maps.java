package lists;

import java.util.HashMap;
import java.util.Map;


public class Maps {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> ms = new HashMap<>();
		
		// inserisco key, value
		ms.put("Luca", 5); // luca è la key, 5 è il value
		ms.put("Marco", 3);
		ms.put("Gigi", 2);
		
		// leggo
		int x = ms.get("Marco");
		System.out.println(x);
		
		// TODO
		// 1. Si utilizzi l'hashmap e il treemap utilizzando come chiave la classe persona.
		
		// 2. si supponga di avere un array di persone, contenente anche oggetti duplicati,
		// retituire un hashmap per ogni persona indichi quante volte è presente l'array iiniziale.
		
		// List                     => Map
		//["Luca", "Pluco", "Luca"] => {"Luca": 2, "Pluco" : 1}
		
		
		
	}

}
