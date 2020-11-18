import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter any word to be reversed: ");
		String string = scan.nextLine();
		
		System.out.println(reverseString(string)); 
	}
	
	public static String reverseString(String string) {
		String stringResult = "";
		for(int i = string.length()-1; i >= 0; i--) {
			stringResult += string.charAt(i);
		}
		return stringResult;
	}

}
