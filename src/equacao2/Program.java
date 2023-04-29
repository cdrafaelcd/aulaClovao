package equacao2;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora cal = new Calculadora();
		
		cal.a = sc.nextDouble();
		cal.b = sc.nextDouble();
		cal.c = sc.nextDouble();
		
		cal.delta = Math.sqrt(cal.b * cal.b - 4 * cal.a * cal.c);

	if (cal.a != 0) {
		cal.delta = cal.b * cal.b - 4 * cal.a * cal.c;
			
		if (cal.delta < 0) {
			System.out.println("DELTA = " + cal.delta);
			System.out.println("Nao existem raizes reais! ");
		}
		else if (cal.delta == 0) {
			cal.X1 = -cal.b / (2 * cal.a);
			System.out.printf("x = " + String.format("%.2f", cal.X1));
		}
		else  {
			cal.X1 = (-cal.b - Math.sqrt(cal.delta)) / (2 * cal.a);
			cal.X2 = (-cal.b + Math.sqrt(cal.delta)) / (2 * cal.a);
			System.out.printf("X = " + String.format("%.2f", cal.X1));
			System.out.printf("X = " + String.format("%.2f", cal.X2));
		}
	} else {
		System.out.println("Não é uma equação do 2º grau!");
		}
		
	}

}
