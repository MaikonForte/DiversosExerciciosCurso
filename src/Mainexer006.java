import java.util.Scanner;

public class Mainexer006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero:");
		num = sc.nextInt();
		
		if (num <0) {
			System.out.println("negativo");
		}
		else {
			System.out.println("positivo");
		}
		
	}

}
