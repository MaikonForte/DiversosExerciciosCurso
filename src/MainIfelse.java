import java.util.Scanner;

public class MainIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		System.out.println("Quantas horas?");
		horas = sc.nextInt();
		
		
		if (horas < 12 )
			System.out.println("Bom Dia!");
		
		else if (horas <18) {
			System.out.println("Boa tarde!");
			}
		
		else {
				System.out.println("Boa Noite!");
			
			
		}
		
			sc.close();
		

	}

}
