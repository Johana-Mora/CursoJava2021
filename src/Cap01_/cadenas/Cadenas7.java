/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap01_.cadenas;
import java.util.StringTokenizer;
/**
 *
 * @author kunzi
 */
public class Cadenas7 
{
    public static void main (String[] args)
    {
         String s = "Juan|Marcos|Carlos|Matias";    
        StringTokenizer st = new StringTokenizer(s,"|");    
        String tok;
       while( st.hasMoreTokens() ) 
     {        
        tok = st.nextToken();      
        System.out.println(tok);    
     }        
    }

    
}
