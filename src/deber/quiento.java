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
public class quiento {
    public static void main(String[] ARGS)
	{
		int[] myList = {5,4,8,6,3,2,9};
		Scanner obtenerNumero = new Scanner(System.in);
		int i, max, min, suma;
 
		min=max=myList[0];
 
		for(i = 0; i < myList.length; i++)
		{
			if(min>myList[i])
			{
				min=myList[i];
			}
			if(max<myList[i])
			{
				max=myList[i];
			}
		}
 
		System.out.println("El máximo es " + max + " y el minimo es " + min);
	}
}

