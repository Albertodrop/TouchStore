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
public class Product {
    public String nombre_prod,codigo_prod,consult_prod;
    public int precioMay_prod,precioMen_prod,stok_prod;
    public Product (){
        
    }

    public String getConsult_prod() {
        return consult_prod;
    }

    public void setConsult_prod(String consult_prod) {
        this.consult_prod = consult_prod;
    }
    
    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public int getPrecioMay_prod() {
        return precioMay_prod;
    }

    public void setPrecioMay_prod(int precioMay_prod) {
        this.precioMay_prod = precioMay_prod;
    }

    public int getPrecioMen_prod() {
        return precioMen_prod;
    }

    public void setPrecioMen_prod(int precioMen_prod) {
        this.precioMen_prod = precioMen_prod;
    }

    public int getStok_prod() {
        return stok_prod;
    }

    public void setStok_prod(int stok_prod) {
        this.stok_prod = stok_prod;
    }
    
}
