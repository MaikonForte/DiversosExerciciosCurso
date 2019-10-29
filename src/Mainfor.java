import java.util.Scanner;

public class Mainfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i <n; i= i +1) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);
	}

}
