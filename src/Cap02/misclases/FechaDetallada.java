/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap02.misclases;
import Cap02_.fechas.Fecha;
/**
 *
 * @author kunzi
 */
public class FechaDetallada extends Fecha
{
    private static String meses[]={"Enero",
                                 "Febrero",
                                 "Marzo",
                                 "Abril",
                                 "Mayo",
                                 "Junio",
                                 "Julio",
                                 "Agosto",
                                 "Septiembre",
                                 "Octubre",
                                 "Noviembre",
                                 "Diciembre"};
    public String toString()  
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();  
    }
    
}
