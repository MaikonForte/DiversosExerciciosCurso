import java.util.Scanner;

public class Mainexer007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num,num2;
		System.out.println("Digite um numero:");
		
		num = sc.nextInt();
		num2 = sc.nextInt();
		if(num % num2 ==0 || num2 % num == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não multiplos");
		}
		
		
		
		
		

	}

}
