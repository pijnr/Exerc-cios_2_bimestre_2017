//09) Crie um algoritmo que imprime n�meros impares de 0 at� 100 em ordem decrescente utilizando recursividade.
public class Exercicio09 {
	public static void main(String[] args) {

		imprimirNum(99);

	}

	static int imprimirNum(int mm) {
		System.out.println(mm);
		mm -= 2;
		

		if (mm >= 1)
			imprimirNum(mm);
		return mm;
	}

}

