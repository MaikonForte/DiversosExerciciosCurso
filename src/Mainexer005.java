import java.util.Scanner;

public class Mainexer005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2, num1,num2;
		double vu1,vu2,valor;
		
		cod1 =sc.nextInt();
		num1 = sc.nextInt();
		vu1  = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		vu2  = sc.nextDouble();
		
		valor = (num1 * vu1) + (num2*vu2);
		
		System.out.printf("Valor a ser pago R$:%.2f",valor);

	}

}
