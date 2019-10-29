import java.util.Scanner;

public class Mainexe006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		
		num = sc.nextDouble();
		
		
		if (num % 2 ==0) {
			System.out.println("par");
		}
		else {
			System.out.println("Impar");
		}

	}

}
