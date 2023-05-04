package p_01_demo;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class D_05_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List einkauf = new ArrayList();
		einkauf.add("Käse") ;
		einkauf.add("Wurst") ;
		einkauf.add("Brot") ;
		einkauf.add(47) ;
		
		// einkauf.remove(0);
		
		for (int i=0; i<einkauf.size();i++) {
			System.out.println(einkauf.get(i));
		}
		
		if(einkauf.contains("Wurst")) {
			System.out.println("Wurst ist an Position : " + einkauf.indexOf("Wurst"));
			System.out.println("wurst ist enthalten");
		} else {
			System.out.println("Nicht in der Liste"); 
		}

	}

}
