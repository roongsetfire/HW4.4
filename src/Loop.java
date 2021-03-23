import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
//		LAB 6
		System.out.println("*** LAB 6 ***");
		int i = 1;
		int c = 0;
		while (i <= 10) {
			c += i;
			System.out.println("i = " + i++);
		}
		System.out.println("sum of 1-10 = " + c);
		for (int j = 1; j <= 100; j++) {
			if (j % 12 == 0) {
				System.out.println("This number mod 12 = 0 => " + j);
			}
		}
		int[] array = { 1, 2, 3, 4, 5 };
		for (int item : array) {
			System.out.println("item = " + item);
		}

//		LAB 7
		System.out.println("*** LAB 7 ***");
		int counter = 20;
		do {
			System.out.println("counter = "+counter--);
		} while (counter >= 10);
		
		int number = 0;
		System.out.println("Please enter number on new line");
		do {
			Scanner myObj = new Scanner(System.in);
			String input = myObj.nextLine();
			int s = Integer.parseInt(input);
			number = s;
			if (number % 2 == 1){
				System.out.println("Break");
			}else {
				System.out.println("Check pass => "+number);
			}
		} while(number%2 != 1);
		
//		LAB 8
		System.out.println("*** LAB 8 ***");
		for (int count = 0;count<=20;count++) {
			if(count == 11) {
				break;
			}
			System.out.println("This count = "+count);
		}
		
	}

}
