import java.util.Formatter;
import java.util.Scanner;

public class dick {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]) {
		try {
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("������� ��� ���?");
			int a = (int)Double.parseDouble(((Scanner) scn).next());
			System.out.println("��� ��� �����?");
			String b = ((Scanner) scn).next();
			System.out.println("��� �� �����?");
			String c = ((Scanner) scn).next();
			x.format("���� ����� %s, ��� %d ���, � ���� � ������ %s", b, a , c);
			x.close();
		}catch(Exception e) {}
	}
}