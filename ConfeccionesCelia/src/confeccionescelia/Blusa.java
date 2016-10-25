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
public class Blusa extends Prendas {
    public double cuello,contornoBusto,contornoCintura,contornoCadera,espalda,contornoManga;
    public Blusa (){
        
    }

    public Blusa(String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
    }
    

    public void setCuello(double cuello) {
        this.cuello = cuello;
    }

    public void setContornoBusto(double contornoBusto) {
        this.contornoBusto = contornoBusto;
    }

    public void setContornoCintura(double contornoCintura) {
        this.contornoCintura = contornoCintura;
    }

    public void setContornoCadera(double contornoCadera) {
        this.contornoCadera = contornoCadera;
    }

    public void setEspalda(double espalda) {
        this.espalda = espalda;
    }

    public void setContornoManga(double contornoManga) {
        this.contornoManga = contornoManga;
    }
    
    public double FraccionesCuello (){
       cuello= cuello/6;
        return cuello;
    } 
     public double FraccionesContornoBusto (){
       cuello= contornoBusto/4;
        return cuello;
    } 
     public double FraccionesContornoCintura(){
         contornoCintura=contornoCintura/4;
         return contornoCintura;
     }
     public double FraccionesContornoCadera(){
         contornoCadera = contornoCadera /4;
         return contornoCadera;
     }
     public double FraccionesEspalda(){
         espalda= espalda /2;
         return espalda;
     }
     public double ContornoManga(){
         contornoManga= contornoManga/2;
         return contornoManga;
     }
     
}
