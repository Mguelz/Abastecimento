package abastecimento;

import java.util.Scanner;

public class GasolinaOuAlcool {
/*
 * Digitar o valor da gasolina e álcool
 * 
 * se o álcool for 70% menor do que o preco da gasolina
 * Abastecer com alcool
 * caso contrario, abastecer com gasolina 
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double gasolina, alcool;

		System.out.println("Digite o valor do álcool: ");
		alcool = scanner.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = scanner.nextDouble();

		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com álcool");
		} else {
			System.out.println("Abastecer com gasolina");
		}

		scanner.close();
	}

}
