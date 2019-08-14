/*Hacer un programa que calcule e imprima el salario semanal de un empleado 
 * a partir de sus horas semanales trabajadas y de salario por hora */

package eje;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horas, valor, total;
		System.out.println("digite las horas trabajadas: ");
		horas = entrada.nextInt();
		System.out.println("las horas trabajadas son: "+horas);
		
		System.out.println("digite el valor por hora");
		valor = entrada.nextInt();
		System.out.println("Una hora vale: "+valor);
		
		total = horas * valor;
		System.out.println("El salario semanal es de: "+total);
	}

}
