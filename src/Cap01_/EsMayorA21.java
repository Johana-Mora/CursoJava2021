/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap01_;

import java.util.Scanner;

/**
 *
 * @author kunzi
 */
public class EsMayorA21 
{
    public static void main (String [] args)
    {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
       int  edad=miScanner.nextInt();
       
        if (edad>=21)
            System.out.println("Usted es mayor de edad.");
          else
            System.out.println("Usted es menor de edad.");
    }
}
