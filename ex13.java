import java.util.Scanner; 

public class ex13 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = 0, c = 0, i, j;

        System.out.println("Digite a altura e a largura");
        r = in.nextInt();
        c = in.nextInt();

        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
            	
                if (i == 1 || i == r || j == 1 || j == c)
                	
                    System.out.print("+ ");
                
                else
                	
                    System.out.print("  ");
            }
            System.out.print("\n");
           
        }
    }
}

