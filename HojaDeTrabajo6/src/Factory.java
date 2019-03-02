
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */


public class Factory {
    /**
     * 
     * @param tipo de interfaz
     * @return interfaz seleccionada 
     */
     public static Map getImplementacion(int tipo){ //Tipo de la interfaz
        if(tipo==1){          
            System.out.println("Ha utilizado Hashmap");
            return new HashMap<String, String>();            
        }
        
        else if(tipo==2){
            System.out.println("Ha utilizado TreeMap");
            return new TreeMap<String, String>();            
        }
        
        else {
            System.out.println("Ha utilizado LinkedHashMap");
            return new LinkedHashMap<String, String>();            
        }        
    }    
    
}

