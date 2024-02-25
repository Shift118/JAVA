import java.util.HashMap;

public class Roman {
	String roman;
	int decimal;
	public Roman(String r) {
		roman = r;
		decimal = 0;
	}
	int RomanTOString() {
		char romanCharacters[] = roman.toCharArray();
		HashMap <Character,Integer> RtoD = new HashMap<>();
		RtoD.put('I',1);
		RtoD.put('V',5);
		RtoD.put('X',10);
		RtoD.put('L',50);
		RtoD.put('C',100);
		RtoD.put('D',500);
		RtoD.put('M',1000);
		RtoD.put('G',5000);
		RtoD.put('H',10000);
		for (int i = roman.length()-1; i >= 0 ;i--) {
			if (i == 0) {
				decimal += RtoD.get(romanCharacters[i]);
			}else if(RtoD.get(romanCharacters[i]) > RtoD.get(romanCharacters[i-1])) {
				decimal += -RtoD.get(romanCharacters[i-1]) + RtoD.get(romanCharacters[i]);
				i--;
			} else if (RtoD.get(romanCharacters[i]) < RtoD.get(romanCharacters[i-1])) {
				decimal += RtoD.get(romanCharacters[i-1]) + RtoD.get(romanCharacters[i]);
				i--;
			}
		}
	return decimal;
	}
}

