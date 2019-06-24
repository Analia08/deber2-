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
public class cuerto {
    public static void main(String[] args) {
        //pedirHoras();
        calcularSalario();
    }

    public static int pedirHoras() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce las horas que ha trabajado: ");
        int horas = teclado.nextInt();
        return horas;
    } 

    
    public static void calcularSalario() {
        int resultado = 0, horasExtra = 0; 
        // La variable horasExtra guardara las horas extra
        final int horasNormales = 35;	
        int hora = pedirHoras();
        //usara solo en el caso de que hayan horas extra.
        if (hora <= 35) {			
            resultado = hora * 15;		
            System.out.println(resultado);
        } else {		//Si no...habran horas extras, por lo que...
            horasExtra = (hora - 35) * 22;		
            resultado = horasNormales * 15 + horasExtra;	
            System.out.println(resultado);
        }
        //return resultado;
    }	

    public static void mostrarResultado() {

    }
}

