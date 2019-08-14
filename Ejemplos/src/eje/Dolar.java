package eje;

import java.util.Scanner;

public class Dolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float Guillermo, Luis, Juan, total;
		System.out.println("digite los dolares q tiene Guillermo: ");
		Guillermo = entrada.nextFloat();
		System.out.println("los dolares de Guillermo son: "+Guillermo);
		
		Luis = Guillermo/2;
		System.out.println("los dolares de Luis son: "+Luis);
		
		Juan = (Guillermo+ Luis)/2;
		System.out.println("los dolares de Juan son: "+Juan);
		
		total=Guillermo+Luis+Juan;
		System.out.println("el total de dolares que tienen los tres es de: "+total);
	}

}
