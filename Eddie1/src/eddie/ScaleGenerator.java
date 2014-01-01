package eddie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScaleGenerator {
	
	public static void main(String[] args){
		boolean cont = true;
		
		while(cont==true){
		Random r = new Random();
		
		System.out.println("Play this scale: ");
		 
		Scale[] scales = Scale.values();
		int length = scales.length;
		int pick = r.nextInt(length);
		System.out.println(scales[pick].getFriendlyName());
		
		Key[] keys = Key.values();
		int keyLength = keys.length;
		int keyPick = r.nextInt(keyLength);
		System.out.println(keys[keyPick].getKeyName());
		System.out.println("Press enter to get another");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		}

	}
	
}
