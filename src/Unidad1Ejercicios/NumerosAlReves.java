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
public class NumerosAlReves
{
       public static void main(String[] args) {
     Scanner miscanner=new Scanner(System.in);
        int num;
        int mil=0;
        int cien=0;
        int dies=0;
        int uni=0;
        int num2;
        do
        {
        System.out.print("ingrese un número de 4 dígitos: ");
        num=miscanner.nextInt();
        num2=num;
        if(num<0||num>9999)
        {
            System.out.println("el numero ingresado no es valido.");
        }
        }while(num<0||num>9999);
              
        if(num>999)
        {
            mil=num/1000;     
            num-=(mil*1000);
        }
        
        if(num>99)
            {
                cien=num/100;
                num-=(cien*100);
            
            }
        if(num>9)
            {
                dies=num/10;
                num-=(dies*10);           
            
            }
        if(num<10)
        {
            uni=num;
            
        }
        if (num2>999&&mil>0)
        {
            System.out.println(uni+" "+dies+" "+cien+" "+mil);
        }
        if(num2<1000&&cien>0)
        {
            System.out.println(uni+" "+dies+" "+cien);
        }
        if(num2<100&&dies>0)
        {
            System.out.println(uni+" "+dies);
        }
        if(num2<10)
        {
            System.out.println(""+uni);
        }
    
    }
}
