import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Quantas pessoas? ");
			int n = sc.nextInt();
			
			System.out.println("Digite a(s) altura(s): ");
			double[] vect = new double[n];
			for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			}
			
			double soma = 0.0;
			for (int i=0; i<n; i++) {
				soma += vect[i];
			}
			
			double altmedia = soma / n;
			
			System.out.printf("A média das alturas é: %.2f%n", altmedia);
			
			sc.close();
		}
	}

