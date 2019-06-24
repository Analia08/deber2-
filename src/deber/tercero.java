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
public class tercero {
    public static void main(String[] args) {



double artUno= 0; 

double artDos= 0;

double artTres= 0;

double artCuatro= 0;



double comisionSemanal= 200; // weekly fixed commision 

double comisionVar= 0.09;

double articulos= artUno + artDos + artTres + artCuatro; // Summation of articles

double totalIngresos; // total articulos * comision + 200 semanal


Scanner input = new Scanner(System.in);


System.out.println("Enter \"Cant of Article one\": ");

artUno = input.nextInt();

artUno *= 239.99;


System.out.println();



System.out.println("Enter \"Cant of Article Two\": ");

artDos = input.nextInt();

artDos *= 129.75;


System.out.println();



System.out.println("Enter \"Cant of Article Three\": ");

artTres = input.nextInt();

artTres *= 99.95;

System.out.println();



System.out.println("Enter \"Cant of Article Four\": ");

artCuatro = input.nextInt();

artCuatro *= 350.89;


System.out.println();



articulos= artUno + artDos + artTres + artCuatro; 

totalIngresos= comisionSemanal + (articulos*comisionVar);



System.out.println("\n");

System.out.printf ("Your weekly commision is: %.2f\n", totalIngresos);


System.out.println("\n");

   }
}
}
