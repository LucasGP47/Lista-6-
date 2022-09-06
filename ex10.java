import java.util.Scanner;
import java.util.Random;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Deseja jogar agora?: ");
		
	    
	    System.out.println(jogo());	    
	     
		entrada.close();
	    
	    }
	public static String jogo() {
		
		 Random ger = new Random();
		 
		 int pont = 0;
		    
		 Scanner entrada = new Scanner (System.in);		 
		 
		 int sorteado = ger.nextInt(10) + 2;
		 
		 String jogo = null;
		    
		switch (sorteado) {
		
		case 2:
			jogo = "Perdeu!";
			
		case 3: 
			jogo = "Perdeu!";
			
		case 12:
			jogo = "Perdeu!";
			
		case 7: 
			jogo = "Venceu!";
			
		case 11: 
			jogo = "Venceu!";
			
		}
		
		if (sorteado == 4 || sorteado == 5 || sorteado == 6 || sorteado == 7 || sorteado == 9) {
			pont = sorteado;
			
			
			Random ger1 = new Random();
			int sorteado1 = ger1.nextInt(10) + 2;
			
			while (sorteado != sorteado1 ) {
				System.out.println("Jogue novamente:  ");
			Random ger2 = new Random();
			int sorteado2 = ger2.nextInt(10) + 2;
			
			if (pont == sorteado2) {
				jogo = "Venceu!";
				break;
			}
			
			if (sorteado2 == 7) {
				jogo = "Perdeu!";
				break;
			}
			
			}
		}
		entrada.close();
		return jogo;
		
	}
	
	
		
		
	}
	
	


