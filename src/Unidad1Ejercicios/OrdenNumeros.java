/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1Ejercicios;
import java.util.Scanner;

/**
 *
 * @author kunzi
 */
public class OrdenNumeros 
{
    public static void main(String[] args) {
       int a,b,c;
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        a=miScanner.nextInt();
        System.out.print("Introduzca segundo número: ");
        b=miScanner.nextInt();
        System.out.print("Introduzca tercer número: ");
        c=miScanner.nextInt();

        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a)
                      System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                      }
                   }
                }
            }
        }
}
