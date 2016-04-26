package net.medox.tutorial;

public class Main{
	public static int wert = 10;
	
	public static void main(String[] args){
		int wert1 = 23;
		int wert2 = 3;
		String text = "Hallo";
		
		textSchreiben("Der Wert ist " + (wert1 - wert2 - wert));
		textSchreiben(text);
		textSchreiben("Rechnung " + rechnen(wert1, wert2));
	}
	
	public static void textSchreiben(String text){
		System.out.println(text);
	}
	
	public static int rechnen(int wert1, int wert2){
		return wert1+wert2+wert;
	}
}
