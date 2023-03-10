package odev;

public class CaseBlokları {

	public static void main(String[] args) {
		
		int day = 5;
		switch (day)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
			default:
				System.out.println("böyle bir gün yok");
		}
	}

}
