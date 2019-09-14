
public class ArrayLength {

	public static void main(String[] args) {
		
		char[][] digit3 = { { '.', '_', '.' }, { '.', '_', '|' }, { '.', '_', '|' } ,{ '.', '_', '.' }};
		
		System.out.println(digit3.length); //column length 
		System.out.println(digit3[0].length); // row length
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("co-ordinates"+"i="+i+",j="+j+" :"+Character.toString(digit3[i][j]));
			}
			System.out.println();
		}
	}

}
