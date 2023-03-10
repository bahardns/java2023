package odev;

public class Conditionals {

	public static void main(String[] args) {

			//variable = (condition) ? expressionTrue :  expressionFalse;

		int sayi = 23;

		if (sayi < 20) {
			System.out.println("sayı 20den kücüktür.");

		} else if (sayi == 20) {
			System.out.println("sayı eşit");
		} else {
			System.out.println("sayı 20den büyüktür");
		}
		String sonuc = (sayi > 20) ? "sayi büyük" : "sayi kücük";
		System.out.println(sonuc);
	}

}
