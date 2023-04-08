package desafiolatam.cl;

import java.util.Scanner;

public class DemoGit {
		
		public static int numero1,  numero2, resultadosuma, resultadomulti,resultadocompara;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			capturaDatos();
			resultadoSuma();
			resultadoMulti();
		
		}
		
		public static int sumar(int a, int b) {
			int c;
			c = a +b;
			return c;
		}
		
		public static int multiplicar(int a, int b) {
			int y;
			y = a*b;
			return y;
		}
		
		public static void capturaDatos() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Ingrese primer número: ");
			numero1 = entrada.nextInt();
			System.out.print("Ingrese segundo número: ");
			numero2 = entrada.nextInt();	
			entrada.close();
		}
		
		public static void resultadoSuma() {
			resultadosuma = sumar(numero1,numero2);
			System.out.println("Suma: " + resultadosuma);
		}
		
		public static void resultadoMulti() {
			resultadomulti = multiplicar(numero1, numero2);
			System.out.println("Multiplicat: " + resultadomulti);
		}

	}

