/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

/**
 *
 * @author ITSLOJA
 */
public class Sexto {
    private String cadena;
 

 
public Sexto(String mensaje)
{  
cadena = mensaje;
} 
 
 
 
public void Presenta()
{
 
int contador = 1;
System.out.print("\n 1 10*N 100*N 1000*N\n\n");
 
while ( 5 >= contador)
{ 
System.out.printf("%6d %6d %6d %6d\n", contador, 10*contador, 100*contador, 1000*contador++);
} 
 
} 
} 

