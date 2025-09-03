package lab_5_Jamesg127;
import java.util.Scanner;
public class Lab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String input1 = scan.nextLine();
		System.out.print("Input: ");
		String input2 = scan.nextLine();
		boolean b = true;
		boolean s = false;
		if (input1.length() == input2.length()) {
			for (int i = 0; i < input1.length(); i++) {
				for (int j = 0; j < input2.length(); j++) {
					if (input1.substring(i, i + 1).equals(input2.substring(j, j + 1))) {
						s = true;
					}
				}
				if (s == false) {
					b = false;
					break;
				}
				else {
					s = false;
				}
			}
		}
		else {
			b = false;
		}
		System.out.println(b);
	}

}
