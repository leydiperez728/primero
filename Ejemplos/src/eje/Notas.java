/*Hacer un ejercicio que calcule e imprima las suma de tres calificaciones*/


package eje;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		// Scanner nombre = new Scanner (in de input entrada) esto es comentario
		Float nota1, nota2, nota3, suma;
		/*System.out.print("digite la nota1: ");
		nota1 = entrada.nextFloat();
		System.out.println("\nla nota1 es: "+nota1);
		
		System.out.print("\ndigite la nota2: ");
		nota2 = entrada.nextFloat();
		System.out.println("\nla nota2 es: "+nota2);
		
		System.out.print("\ndigite la nota3: ");
		nota3 = entrada.nextFloat();
		System.out.println("\nla nota3 es: "+nota3);*/
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("digite la nota1: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("digite la nota2: "));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("digite la nota3: "));
		
		JOptionPane.showMessageDialog(null,"La primera nota es: "+nota1 );
		JOptionPane.showMessageDialog(null,"La segunda nota es: "+nota2 );
		JOptionPane.showMessageDialog(null,"La tercera nota es: "+nota3 );
		
		suma = nota1+nota2+nota3;
		JOptionPane.showMessageDialog(null,"La suma de las notas es: "+suma );
	}

}
