/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap02_.fechas;

/**
 *
 * @author kunzi
 */

public class Fecha 
    
{
 
//     private int dia;
//     private int mes; 
//     private int anio; 
//  // sobrescribimos el metodo toString (lo heredamos de Object)
//     public String toString()  
//     {      // retorna una cadena tal como queremos que se vea la fecha 
//       return dia+"/"+mes+"/"+anio; 
//     }   
//      // :   
//      // setters y getters...
//      // :
    public static void main (String[] args)
    {
    }
  
       private int dia; 
       private int mes;
       private int anio; 
  // constructor 
    public Fecha(int d, int m, int a)   
  {      
   dia = d;   
   mes = m;   
   anio = a;  
  }
 
}
