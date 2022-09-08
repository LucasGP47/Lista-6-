import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o dia: ");
		
		int dia = entrada.nextInt();
		
		while (dia < 1 || dia > 31 ) {
			
			System.out.println("Dia invalido. Reinicie o programa. ");
			break;
		}
		
		
		System.out.println("Informe o ano");
		
		int ano = entrada.nextInt();
		
		while (ano < 1) {
			System.out.println("Ano invalido. Reinicie o programa. ");
		}
		
		System.out.println( dia + " de "+ extenso()+ " de " + ano);
		
		entrada.close();

	}
	
   public static String extenso() {
	   
	   System.out.println("Informe o mes: ");
	   
	   Scanner entrada = new Scanner (System.in);
		
		int mes = entrada.nextInt();
		
		while (mes < 1 || mes > 12) {
			System.out.println("Mes invalido. Reinicie o programa. ");
			break;
		}
	
		String mesdef = null;
		
		entrada.close();
	  
	   String [] meses1 = new String [13];
	   
	   meses1[1] = "Janeiro";
	  
	   meses1[2] = "Fevereiro";
	  
	   meses1[3] = "Março";
	   
	   meses1[4] = "Abril";
	   
	   meses1[5] = "Maio";
	   
	   meses1[6] = "Junho";
	   
	   meses1[7] = "Julho";
	   
	   meses1[8] = "Agosto";
	   
	   meses1[9] = "Setembro";
	    
	   meses1[10] = "Outubro";
	  
	   meses1[11] = "Novembro";
	    
	   meses1[12] = "Dezembro";
	   
	   for (int x = 1; x < mes; x++ ) {
		   mesdef = meses1[x];
	   }
	   
	
	return mesdef;
	   
   }

}
