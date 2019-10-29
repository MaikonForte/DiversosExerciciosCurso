import java.util.Scanner;

public class Mainwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int chutes = 0; // mostra em qual posição o bloco iniciara, por exemplo se estivesse o numero 2
						// o contador
						// começaria no 2 e assim sucetivamente!

		while (chutes < 10) {
			chutes = chutes + 1;
			if (chutes == 7 || chutes == 5 || chutes == 9) {

				continue; // esse comando interrompe o luping e oculta os numeros mostrado no if no caso 7
							// ,5 e 9 ou seja de 0 a 10 esses numeros nao apareceram !
			}
			if (chutes == 8) { // o break interrompe a continuação e volta pro começa ou seja ele para no
								// numero escolhido
				break;
			}
			System.out.println("chutes " + chutes);

		}

	}

}
