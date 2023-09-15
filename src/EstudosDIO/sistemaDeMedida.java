
//Switch Case

package EstudosDIO;

import java.util.Scanner;

public class sistemaDeMedida {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o tamanho? ");
		String sigla = ler.next();

		switch (sigla) {

		case "P": {
			System.out.println("Pequeno");
			break;
		}
		case "M": {
			System.out.println("Médio");
			break;
		}
		case "G": {
			System.out.println("Grande");
			break;
		}
		case "GG": {
			System.out.println("Extra Grande");
			break;
		}
		default: {
			System.out.println("Indefinido");

		}
		}
		ler.close();
	}

}
