package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Question_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static class list {
		static ArrayList<String> name = new ArrayList<>();
		static ArrayList<String> quan = new ArrayList<>();
		static ArrayList<Double> price = new ArrayList<>();

		public list(String N, String Q, double C,int B) {
			if (list.name.contains(N))
				set(list.name.indexOf(N), Q, C);
			else {
				list.name.add(N);
				list.quan.add(Q);
				if(getcost()>B) {
					System.out.println("Can't Buy the product ###(because budget left is " + B + ")");
				}else {
				list.price.add(C);}
			}

		}

		private ArrayList<String> getname() {
			return name;
		}

		private void set(int index, String Q, double C) {
			quan.set(index, Q);
			price.set(index, C);
		}
		private int getcost() {
			double sum=0;
			for(double d:list.price ) {
				sum+=d;
			}
			return (int) sum;
		}

		private static void check(int CT) {
			if (price.contains((double) CT)) {
				int ret = list.price.indexOf((double) CT);
				System.out.println("You can buy " + name.get(ret));
			}
			System.out.println("Final List:");
			System.out.println("Pdt Quantity Price");
			for (int i = 0; i < name.size(); i++) {
				System.out.println(name.get(i) + "     " + quan.get(i) + "      " + price.get(i));
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x = 0;
		System.out.println("Enter Budget: ");
		int budget = Integer.parseInt(br.readLine());
		if (budget < 0)
			throw new IllegalArgumentException("Should be int");
		int choice = 0;
		printit();

		while (true) {
			try {
				
				System.out.println("Enter The Choice");
				choice = Integer.parseInt(br.readLine());
				if (choice < 1 || choice > 2)
					throw new NumberFormatException();
				switch (choice) {
				case 0:
					printit();
					break;
				case 1:
					 x=additem(budget);
					if (x== 0) {
						System.out.println("no more items could be bought");
						list.check(x);
						System.exit(0);
					}
					break;
				case 2:
					//System.out.println(x);
					list.check(x);
					System.exit(0);
					break;
				default:
					throw new NumberFormatException();
				}

			} catch (NumberFormatException e) {
				System.out.println("-Error---Enter correctly---");
			}
		}
	}

	static void printit() {
		System.out.println("1.Add item");
		System.out.println("2.exit");

	}

	static int additem(int budget) throws IOException {

		System.out.println("Enter Product name: ");
		String P = br.readLine();
		System.out.println("Enter Quantity: ");
		String Q = br.readLine();
		System.out.println("Enter Price: ");
		double C = Double.parseDouble(br.readLine());
		list l = new list(P, Q, C,budget);
		int left = l.getcost();		
		System.out.println("Amount Left: " + (budget-left));
		return (budget-left);
	}

}
