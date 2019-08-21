import java.util.Formatter;
import java.util.Scanner;

public class dick {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]) {
		try {
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("Сколько вам лет?");
			int a = (int)Double.parseDouble(((Scanner) scn).next());
			System.out.println("Как вас зовут?");
			String b = ((Scanner) scn).next();
			System.out.println("Где вы живёте?");
			String c = ((Scanner) scn).next();
			x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a , c);
			x.close();
		}catch(Exception e) {}
	}
}