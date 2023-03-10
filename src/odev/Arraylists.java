package odev;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {

	public static void main(String[] args) {

		ArrayList<String> isimler = new ArrayList<String>();
		isimler.add("bahar");
		isimler.add("emine");
		
		isimler.get(0);
		System.out.println(isimler.get(0));
		
		isimler.set(0, "bengu");
		System.out.println(isimler.get(0));
		
		Collections.sort(isimler);
		
		for(String i : isimler) {
		System.out.println(i);
		}
		
	}

}
