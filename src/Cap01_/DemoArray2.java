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
public class DemoArray2
{
    public static void main (String [] args)
    {
       String dias[]={"Lunes", "Martes", "Miercoles", 
           "Jueves", "Viernes", "Sabado","Domingo"}; 
       Scanner miScanner =new Scanner (System.in);
       System.out.println("Ingrese el dia de la semana (numero): ");
       int v=miScanner.nextInt();
       if (v<dias.length)
       {
           System.out.println(dias[v-1]);
           
       }
       else
       {
           System.out.println("Dia Incorrecto...");
       }
    }
}
