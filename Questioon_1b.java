package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questioon_1b {

	public static void main(String[] args) throws NumberFormatException, IOException {
//			A 
//	      B C 
//	    D E F 
//	  G H I J 
//	K L M N O
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of rows");
		int rows = Integer.parseInt(br.readLine());
		int charr=65;
		for (int i = 0; i < rows; i++) {
			for (int space = 2*(rows - i); space > 0; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print((char)charr+" ");
				charr++;
			}
			System.out.println();
		}

	}

}
