package EstudosDIO;

import java.util.Scanner;

public class mediaEscolar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a nota do aluno: ");
		double nota = ler.nextDouble();

		String resultado = nota >=7 ? "Aprovado!" : nota >= 5 && nota < 7 ?"Recuperação" : "Reprovado!";
			System.out.println(resultado);
		
		ler.close();
		
	}
	
}
