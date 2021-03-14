package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1a {

	public static void main(String[] args) throws IOException {
//		    *            
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * *
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of rows");
		int rows=Integer.parseInt(br.readLine());
		for(int i=0;i<rows;i++) {
			for(int space=rows-i;space>1;space--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		

	}

}
