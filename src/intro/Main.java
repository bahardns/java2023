package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//snippet: hazır kod
		System.out.println("hello world");
		
		String metin="java";
		System.out.println(metin);
		
		String Ortametin="bootcamp";
		System.out.println(Ortametin);
		//javada kod satırları ; ile bitirilmeli
		//değişken isimlendirmeleri javada camselCase(baharDns) yazılır.
		
		int vade=12;
		
		double dolarDun=18.22;
		double dolarBugün=18.20;
		
		boolean dolarDustuMu=false;
		
		String okYounu="";
		//Şart blokları
		if (dolarBugün<dolarDun) {
			okYounu="down.svg";
			System.out.println(okYounu);
		} else if (dolarBugün>dolarDun) {
			okYounu="up.svg";
			System.out.println(okYounu);
		} else{
			System.out.println("eşittir");
			
		}
		//camp birinci gün
		
		String[] dizi={"mutlu emekli","kredi"};
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	
		
	}

}
