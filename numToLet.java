package nTl;

import java.util.Scanner;

public class numToLet {

	public static void main(String[] args) {
		
		String [] mainNumbers = new String[20];
		String [] mainNumbers2 = new String[9];
		
		mainNumbers[0] = "Zero";
		mainNumbers[1] = "One";
		mainNumbers[2] = "Two";
		mainNumbers[3] = "Three";
		mainNumbers[4] = "Four";
		mainNumbers[5] = "Five";
		mainNumbers[6] = "Six";
		mainNumbers[7] = "Seven";
		mainNumbers[8] = "Eight";
		mainNumbers[9] = "Nine";
		mainNumbers[10] = "Ten";
		mainNumbers[11] = "Eleven";
		mainNumbers[12] = "Twelve";
		mainNumbers[13] = "Thirteen";
		mainNumbers[14] = "Fourteen";
		mainNumbers[15] = "Fifteen";
		mainNumbers[16] = "Sixteen";
		mainNumbers[17] = "Seventeen";
		mainNumbers[18] = "Eighteen";
		mainNumbers[19] = "Nineteen";
		mainNumbers2[0] = "Twenty";
		mainNumbers2[1] = "Thirty";
		mainNumbers2[2] = "Fourty";
		mainNumbers2[3] = "Fifty";
		mainNumbers2[4] = "Sixty";
		mainNumbers2[5] = "Seventy";
		mainNumbers2[6] = "Eighty";
		mainNumbers2[7] = "Ninety";
		mainNumbers2[8] = "One Hundred";
		
		int leftPart = 0;
		int rightPart = 0;
		int theNumber = 0;
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter a number");
		theNumber = c.nextInt();
		
		if(theNumber <= 109) {
			
			if(theNumber < 20) {
				System.out.println(mainNumbers[theNumber]);
			}else {
				rightPart = theNumber % 10;
				leftPart = theNumber / 10;
				if(rightPart == 0) {
					System.out.println(mainNumbers2[leftPart - 2]);
				}else {
					System.out.println(mainNumbers2[leftPart - 2] + " " + mainNumbers[rightPart]);
				}
			}			
		}
		
		if(theNumber > 109 && theNumber < 200) {
			int rightPart0 = theNumber % 100;
			
			if(rightPart0 < 20) {
				System.out.println(mainNumbers[rightPart0]);
			}else {
				rightPart = rightPart0 % 10;
				leftPart = rightPart0 / 10;
				if(rightPart == 0) {
					System.out.println(mainNumbers2[8] + " " + mainNumbers2[leftPart - 2]);
				}else {
					System.out.println(mainNumbers2[8] + " " + mainNumbers2[leftPart - 2] + " " + mainNumbers[rightPart]);
				}
			}
			
		}
	}
}
