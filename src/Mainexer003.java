import java.util.Scanner;

public class Mainexer003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio 1
		int a,b,c,d,diferen�a;
		a = 5;
		b = 6;
		c = 7;
		d = 8;
		diferen�a = (a*b) - (c*d);
		System.out.printf("A diferen�a � %d\n", diferen�a);
		
		//Exercicio 2
		Scanner sc = new Scanner(System.in);
		int x,y,z,w,diferen�a3;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		w = sc.nextInt();
		diferen�a3 = (x*y) - (z*w);
		System.out.printf("A diferen�a � %d",diferen�a3);

	}

}
