import java.util.Scanner;

public class Maintexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int w;
		String x;
		String y;
		String z;
		
		w = sc.nextInt();
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("Os dados digitados foram:");
		System.out.println(w);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		// comando sc.close() é utilizado para encerrar o comando Scanner SC!
		double h = Math.pow(2,3);
		System.out.printf("O valor de 2 elevado a 3 é %.2f", h);
	}

}
