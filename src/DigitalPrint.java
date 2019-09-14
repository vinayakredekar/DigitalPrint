import java.util.Scanner;

public class DigitalPrint {

	private static char[][] printMap;
	private static char[][] tmp;
	private static final char[][] digit0 = { { '.', '_', '.' }, { '|', '.', '|' }, { '|', '_', '|' } };
	private static final char[][] digit1 = { { '.', '.', '.' }, { '.', '.', '|' }, { '.', '.', '|' } };
	private static final char[][] digit2 = { { '.', '_', '.' }, { '.', '_', '|' }, { '|', '_', '.' } };
	private static final char[][] digit3 = { { '.', '_', '.' }, { '.', '_', '|' }, { '.', '_', '|' } };
	private static final char[][] digit4 = { { '.', '.', '.' }, { '|', '_', '|' }, { '.', '.', '|' } };
	private static final char[][] digit5 = { { '.', '_', '.' }, { '|', '_', '.' }, { '.', '_', '|' } };
	private static final char[][] digit6 = { { '.', '_', '.' }, { '|', '_', '.' }, { '|', '_', '|' } };
	private static final char[][] digit7 = { { '.', '_', '.' }, { '.', '.', '|' }, { '.', '.', '|' } };
	private static final char[][] digit8 = { { '.', '_', '.' }, { '|', '_', '|' }, { '|', '_', '|' } };
	private static final char[][] digit9 = { { '.', '_', '.' }, { '|', '_', '|' }, { '.', '_', '|' } };
	
	public static void main(String[] args) {

		int indexX = 0;
		int indexY = 0;
		Scanner in = new Scanner(System.in);
		String input = in.next();

		Integer.parseInt(input);

		printMap = new char[3][input.length() * 3];

		for (int i = 0; i < input.length(); i++) {

			char digit = input.charAt(i);

			appendOrCreatePrintMap(digit, indexX, indexY);
			indexY += 3;

		}

		printDigitMap();
	}

	private static void appendOrCreatePrintMap(char digit, int indexX, int indexY) {
		 
		switch(Character.getNumericValue(digit)) {
		
		case 0 :  tmp = digit0;break;
		case 1 :  tmp = digit1;break;
		case 2 :  tmp = digit2;break;
		case 3 :  tmp = digit3;break;
		case 4 :  tmp = digit4;break;
		case 5 :  tmp = digit5;break;
		case 6 :  tmp = digit6;break;
		case 7 :  tmp = digit7;break;
		case 8 :  tmp = digit8;break;
		case 9 :  tmp = digit9;break;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				printMap[i][indexY+j] = tmp[i][j];
			}
			
		}
		
	}

	

	private static void printDigitMap() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < printMap[0].length; j++) {
				System.out.print(Character.toString(printMap[i][j]));
			}
			System.out.println();
		}

	}

}

//[C@75b84c92
