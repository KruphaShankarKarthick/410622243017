package Dialogs;
import java.util.Scanner;
public class TopStars {
	public static void main(String[] args) {
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Coose Your Character...");
		System.out.println("Your Options Are ....");
		System.out.println("Luffy"+" "+"SonGoku"+" "+"Naruto"+" "+"Ichigo");
		String userInput=scanner.nextLine();
	
	
        String Luffy = "海賊 に なる 男 だ"+" "+ "which means"+" "+"I Will Be The King of Pirates!";
        String Naruto="だってばよ"+" "+"Which means"+" "+" Better Believe IT!!";
        String SonGoku="かめはめ波"+" "+"Which means"+" "+"KA ME HA ME HAAA!!!";
        String Ichigo="卍解"+" "+"Which means"+" "+"BANKAI!!!!";

	
	{ 
		if (userInput.equals("Luffy")) {
			System.out.println(Luffy);
		}else if(userInput.equals("Naruto")) {
			System.out.println(Naruto);
		}else if(userInput.equals("SonGoku"));{
			System.out.println(SonGoku);
		} if(userInput.equals("Ichigo")) {
			System.out.println(Ichigo);
		}else {
			System.out.println("ThankYou For Playing");
		}
	}
	
}
	}
}

