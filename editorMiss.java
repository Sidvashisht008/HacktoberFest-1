
import java.util.Scanner;
public class Main {	
	public static int editorMiss(String text) {
		int miss =0;
		for(int i =0;i<text.length();i++) {
			if(text.charAt(i)==' '|| Character.isDigit(text.charAt(i))|| Character.isAlphabetic(text.charAt(i))) {	
				continue;
			}else {
				miss++;
			}
		}
		return miss;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String textInput = scn.nextLine();
		int result = editorMiss(textInput);
		System.out.println(result);
	}
	
}
