/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Cards {
     private String nombre;
     private String tipo;
     /**
      * 
      * @param nombre
      * @param tipo 
      */
       public Cards(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
       /**
        * 
        * @return nombre de la carta
        */
       public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return tipo de carta
 */
    public String getTipo() {
        return tipo;
    }
/**
 * 
 * @param tipo 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return nombre + " | " + tipo;
    }
    
    /**
     * Imprime las cortas por tipo.
     * @return: El string de las cartas
     */
    public String porTipo(){
        return tipo + " | " + nombre;
    }
    
    
}

