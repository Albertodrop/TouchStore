/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeccionescelia;

/**
 *
 * @author ALBERTO
 */
public class Prendas {
    String nombre_cliente;
    int telefono;
    String apellido_cliente;
    public Prendas (){
        
    }
   public Prendas(String nombre,String apellido, int telefono){
       this.nombre_cliente=nombre;
       this.apellido_cliente=apellido;
       this.telefono=telefono;
   }
   
}
