import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero que deseja a tabela: ");
		
		int x = entrada.nextInt();
		
		System.out.println(tabelinha(x));
		
		entrada.close();
	}
	
	public static String tabelinha(int tam) {
		String saida = "\n";
		int j = -1;		
		for (int x = 0; x < tam; x++ ) {
			j = j + 1;
			saida += "\n";
			
			for(int y = 0; y <= j; y++) {
				saida += ((x +1) + " ");
			}
			
			
			
		}
		return saida;
	}
	
    
}
