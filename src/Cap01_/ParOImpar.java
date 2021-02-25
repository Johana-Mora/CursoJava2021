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
public class ParOImpar 
{
    public static void main (String [] args)
    {
       Scanner miScanner =new Scanner ( System.in);
       System.out.println("Ingrese su valor: ");
       int v=miScanner.nextInt();
       int resto= v % 2;
       if (resto==0)
       {
           System.out.println(v +" es par.");
       }
       else 
       {
           System.out.println(v+ " es impar.");
       }
    }
}
