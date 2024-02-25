
public class ChessBoard {

	public static void main(String[] args) {
		int count = 1;
//		System.out.print((char)0x2B1C); // White 
//		System.out.print((char)0x25A0);// Black

		for (int i = 0; i<36 ; i++) {
			System.out.print((char)0x2B1C+" "); // White 	
			count++;
			if (count == 9) {
				System.out.println();
				count = 1;
			}
			System.out.print((char)0x25A0+" ");// Black
			count++;
			if (count == 9) {
				System.out.println();
				count = 1;
			}			
		}
	}

}
