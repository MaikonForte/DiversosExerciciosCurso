import java.util.Scanner;

public class Mainexe005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		
		triangulo = a*c/2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = ((a + b)*c)/2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf(" Triangulo %.3f\n Circulo %.3f\n Trapezio %.3f\n quadrado %.3f\n retangulo %.3f", triangulo,circulo,trapezio,quadrado,retangulo);
	}

}
