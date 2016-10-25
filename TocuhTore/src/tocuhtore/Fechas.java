/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocuhtore;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ALBERTO
 */
public class Fechas {
     public static String mes,dia;
    public static int año,diames;
    public static Date fechas = new Date ();
    public static Calendar day = Calendar.getInstance();
    
   
    public Fechas(){
       
    }
    public String Dia (){
        dia = Integer.toString(day.get(Calendar.DAY_OF_WEEK)); 
        switch(dia){
            case "1":
                dia = "Domingo";
                break;
            case "2":
                dia = "Lunes";
                break;
            case "3":
                dia = "Martes";
                break;
            case "4":
                dia = "Miercoles";
                break;
            case "5":
                dia = "Jueves";
                break;
            case "6":
                dia = "Viernes";
                break;
            case "7":
                dia = "Sabado";
                break;
            
        }
        return dia;
    }
    
   public String Mes(){
       switch(fechas.getMonth()){
            case 0:
                mes = "Enero";
                break;
            case 1:
                mes = "Febrero";
                break;
            case 2:
                mes = "Marzo";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Mayo";
                break;
            case 5:
                mes ="Junio";
                break;
            case 6:
                mes ="Julio";
                break;
            case 7:
                mes ="Agosto";
                break; 
            case 8:
                mes ="Septiembre";
                break;  
            case 9:
                mes ="Octubre";
                break; 
            case 10:
                mes ="Noviembre";
                break;  
            case 11:
                mes ="Diciembre";
                break;  
       }
       return mes;
   }
   public int Año(){
       año=day.getWeekYear();
       return año;
   }
  public  int DiaMes(){
       
       return fechas.getDate();
   }
  public int Horas(){
      return fechas.getHours();
  }
  public int Minutos(){
      return fechas.getMinutes();
  }
}


