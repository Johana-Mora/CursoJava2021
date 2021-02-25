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
public class ParOImparVariante 
{
    public static void main (String [] args)
    {
        Scanner miScanner =new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int v=miScanner.nextInt();
        int resto= v % 2;
        //Variante: Utilizando un if in-line
        String mssg=(resto==0) ? "es Par": "es Impar";
        //se muestra el resultado
        System.out.println(v + " "+mssg);
        
    }
}
