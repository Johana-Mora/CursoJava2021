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
public class PrimerosNumeros1 
{
    public static void main (String [] args)
    {
        Scanner miScanner =new Scanner (System.in);
        System.out.println("Ingrese cualquier numero: ");
        int n=miScanner.nextInt();
        int i=1;
        while(i<=n)
        {
          System.out.println(i);
          i++;
        }
  
    }
  
}
