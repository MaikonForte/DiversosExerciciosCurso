import java.util.Scanner;

public class Mainex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio1
		Scanner sc = new Scanner(System.in);
		
		double num,horas,pg, recebe;
		num = sc.nextDouble();
		horas = sc.nextDouble();
		pg = sc.nextDouble();
		recebe = horas * pg;
		System.out.printf("Numero do Funcionario: %.0f \nHoras trabalhadas: %.0f\nvalor a receber R$: %.2f",num, horas,recebe);
		
		//Exercicio 2
		double num1,horas1, pg1,recebe1;
		num1 = sc.nextDouble();
		horas1 = sc.nextDouble();
		pg1 = sc.nextDouble();
		recebe1 = horas1*pg1;
		System.out.printf("Numero do funcionario %.0f\nHoras trabalhadas:%.0f\nValor a receber R$:%.2f",num1,horas1,recebe1);
		
		//Exercicio 3
		double num2,horas2,pg2,recebe2;
		num2 = sc.nextDouble();
		horas2 = sc.nextDouble();
		pg2 = sc.nextDouble();
		recebe2 = horas2*pg2;
		System.out.printf("Numero do funcionario %.0f\nHoras trabalhadas:%.0f\nValor a receber R$:%.2f",num2,horas2,recebe2);
	}

}
