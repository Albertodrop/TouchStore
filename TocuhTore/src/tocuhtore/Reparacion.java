/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocuhtore;

/**
 *
 * @author ALBERTO
 */
public class Reparacion {
    String marca, servicio_preve,servicio_correctivo,nombre_cliente,fecha_r,Fecha_e;
    int costo ;
    public Reparacion () {
        
    }       
    public void  setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca (){
        return marca;
    }
}
