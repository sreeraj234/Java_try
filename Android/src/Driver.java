import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price");
		int a = sc.nextInt();
		System.out.println("Enter screen size");
		int b = sc.nextInt();
		System.out.println("Enter Thickness");
		double c = sc.nextDouble();
		System.out.println("Enter Is audio jack present?");
		boolean d = sc.nextBoolean();
		System.out.println("Enter Phone name");
		String e = sc.next();
		System.out.println("Enter Phone brand");
		String f = sc.next();
		sc.close();
		AndroidPhone A = new AndroidPhone();
		A.buildPhone(a, b, c, d, e, f);
		A.myAwesomePhone();
	}
}
