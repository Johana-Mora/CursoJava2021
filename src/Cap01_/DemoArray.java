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
public class DemoArray 
{
    public static void main (String [] args)
    {
        int arr[]=new int [10];
        Scanner miScanner =new Scanner (System.in);
        System.out.println("Ingrese un valor (0=>fin): ");
        int v=miScanner.nextInt();
        int i=0;
        
        while (v!=0 && i<10)
        {
            arr[i++]=v;
            System.out.println("Ingrese un valor (0=>fin): ");
            v=miScanner.nextInt();
  
        }
        for (int j=0; j<i; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
