package odev;

public class Diziler {

	public static void main(String[] args) {
	
		int[] sayilar = {1,3,4,5,6,8};
		int enBuyuk=sayilar[0];
		
		for(int i : sayilar ) {
			
			if(enBuyuk < i) 
				enBuyuk = i;
			}
			System.out.println("en büyük değer :" + enBuyuk);
			
		}

	}

