package equacao2;

import java.util.Scanner;

public class teste {

	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    double a, b, c, delta, x1, x2;
		  
		    System.out.print("a = ");
		    a = input.nextDouble();
		    System.out.print("b = ");
		    b = input.nextDouble();
		    System.out.print("c = ");
		    c = input.nextDouble();
		  
		    if (a != 0) {
		      delta = b * b - 4 * a * c;
		  
		      if (delta < 0) {
		        System.out.println("DELTA = " + delta);
		        System.out.println("Não existem raízes reais!");
		      } else if (delta == 0) {
		        x1 = -b / (2 * a);
		    
		        System.out.println("x' = " + x1);
		      } else {
		        x1 = (-b - Math.sqrt(delta)) / (2 * a);
		        x2 = (-b + Math.sqrt(delta)) / (2 * a);
		        System.out.println("x' = " + x1);
		        System.out.println("x'' = " + x2);
		      }
		    } else {
		      System.out.println("Não é uma equação do 2º grau!");
		    }
		  }
		}
		 