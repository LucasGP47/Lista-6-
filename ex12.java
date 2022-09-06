import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a palavra que deseja embaralhar: ");
		
		String p = entrada.next();
		
		System.out.println("Nova palavra: " + embaralha(p));
		entrada.close();
		
	}
	
	
	public static String embaralha(String p) {
		
        List<String> letters = Arrays.asList(p.split(""));
        
        Collections.shuffle(letters);
        
        StringBuilder nova = new StringBuilder(p.length());
        for (String aux : letters) {
        	nova.append(aux);
        }
        return nova.toString();
    }

}
