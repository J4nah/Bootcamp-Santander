package EstudosDIO;

import java.util.Scanner;

public class ResultadoEscolar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		double nota = ler.nextDouble();

		if (nota >= 7 && nota <= 10) {
			System.out.println("Aprovado!");

		} else if (nota > 10) {
			System.out.println("Nota invalida!");
		} else if (nota > 7 && nota <= 0) {
		} else if (nota < 0) {
			System.out.println("Nota invalida");
		} else {
			System.out.println("Reprovado!");
		}
		ler.close();

	}

}
