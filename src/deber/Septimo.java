/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Scanner;

/**
 *
 * @author ITSLOJA
 */
public class Septimo {

    private static void ValorMasGrande() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public void buscarMayor(){
 
		int contador=0, numero=0, numeroGrande=0;
 
		Scanner entrada = new Scanner(System.in);
 
		while(contador < 10){
			System.out.println("Dame un entero");
			numero = entrada.nextInt();
 
			if(numero > numeroGrande)
				numeroGrande = numero;
 
 
			contador++;  // incrementa contador en 1 
 
		} // fin while
 
	System.out.printf("el entero mas grande es %d:", numeroGrande);
 
	} // termina metodo buscaMayor 
 
	public static void main(String[] args) {
            {
		ValorMasGrande masGrande = new ValorMasGrande();
		masGrande.buscarMayor();
            }
           }
}
