/*una compañia de venta de carros usados, paga a su persional de ventas 
 * un salario de 1000 mensuales, mas una comision de 150 por cada carro vendido,
 * mas el 5% del valor de la venta por carro. cada mes el capturistaa de la 
 * empresa ingresa en la computadora los datos pertinentes. hacer un programa 
 * que calcule e imprima el salario mensual del vendedor.
*/
package eje;

import javax.swing.JOptionPane;

public class Ventas {

	public static void main(String[] args) {
		int basico = 1000, valor=0; 
		int venta=0,tventa ;
		double comision, acumulador=0;
		int salario;
		
		venta = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de ventas: "+venta));
		valor = Integer.parseInt(JOptionPane.showInputDialog("digite el valor del auto: "+valor));
			
		for (int a=1;a<=venta;a++) {
		
			comision= valor+ 0.5;
			acumulador= acumulador +comision;	
		}
		tventa=venta*150;

		JOptionPane.showMessageDialog(null,"Salario básico registrado es: "+basico );
		JOptionPane.showMessageDialog(null,"La comisión por venta es: "+tventa );
		salario = basico+tventa;
	   JOptionPane.showMessageDialog(null,"El salario final es: "+salario );

	}

}
