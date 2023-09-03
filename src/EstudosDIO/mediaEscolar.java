package EstudosDIO;

import java.util.Scanner;

public class mediaEscolar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		double nota = ler.nextDouble();

		String resultado = nota >=7 ? "Aprovado!" : "Reprovado!";
			System.out.println(resultado);
		
		ler.close();
		
	}
	
}
