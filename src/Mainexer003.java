import java.util.Scanner;

public class Mainexer003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio 1
		int a,b,c,d,diferença;
		a = 5;
		b = 6;
		c = 7;
		d = 8;
		diferença = (a*b) - (c*d);
		System.out.printf("A diferença é %d\n", diferença);
		
		//Exercicio 2
		Scanner sc = new Scanner(System.in);
		int x,y,z,w,diferença3;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		w = sc.nextInt();
		diferença3 = (x*y) - (z*w);
		System.out.printf("A diferença é %d",diferença3);

	}

}
