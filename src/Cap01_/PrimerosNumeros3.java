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
public class PrimerosNumeros3 
{
    public static void main (String [] args)
    {
       //Con ciclo For
        Scanner miScanner =new Scanner(System.in);
        int n=miScanner.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
