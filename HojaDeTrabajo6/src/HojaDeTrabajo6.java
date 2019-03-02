
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea Elias 17048 
 */
public class HojaDeTrabajo6 {

    /**
     * @param args the command line arguments
     */
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       
        int decision;
        int implementacion = 0;  
        String nombre;
        
        ArrayList<Cards> mazo = new ArrayList<Cards>();

        Scanner teclado = new Scanner(System.in);

        boolean power = true;
        boolean inicio = true;
        
        System.out.println("Bienvenido al programa!\n");    
        System.out.println("Ingrese la implementacion que desea usar: ");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap\n");                                                                 
        
        while (inicio) {                                                                
            
            while (!teclado.hasNextInt()) {
                
                System.err.println("\nCaracter no valido"); 
                
                System.out.print("Por favor ingrese una opcion valida: ");
                teclado.next();          
                
            }       
            
            decision = teclado.nextInt();
            
            if (decision==1) {

                implementacion=1;
                break;

            } else if (decision==2) {

                implementacion=2;                     
                break;

            } else if (decision==3) {

                implementacion=3;
                break;

            } else {
                System.err.println("\nOpcion no valida"); 
                System.out.print("Por favor ingrese una opcion valida: ");
            }
                               
        }
        
        Calculos calculos = new Calculos(implementacion);   
        calculos.leerArchivo("./cards_desc.txt");
              
        
        while (power) {
            
            System.out.println("\n______________________________________________\n");
            System.out.println("Ingrese la accion que desea realizar:\n");
            System.out.println("1. Agregar una carta a mi coleccion");
            System.out.println("2. Mostrar el tipo de una carta especifica");
            System.out.println("3. Mostrar el nombre, tipo y cantidad de cartas que tengo en mi mazo");
            System.out.println("4. Mostrar cada carta que tengo, ordenadas por tipo");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
            System.out.println("7. Salir del programa\n");
            
            while (!teclado.hasNextInt()) {
                
                System.err.println("\nCaracter no valido"); 
                
                System.out.print("Por favor ingrese una opcion valida: ");
                teclado.next();          
                
            }
            
            decision = teclado.nextInt();
            
            if (decision==1) {
                
                System.out.print("Ingrese el nombre de la carta que desea agregar: ");
                nombre = teclado.nextLine();
                nombre = teclado.nextLine();
                mazo = calculos.agregarCarta(nombre, mazo);
                
                                
            } else if (decision==2) {
                
                System.out.print("Ingrese el nombre de la carta a mostrar: ");
                nombre = teclado.nextLine();
                nombre = teclado.nextLine();
                String tipo = calculos.mostrarTipo(nombre);
                System.out.println("\nLa carta es de tipo: " + tipo);
                
            } else if (decision==3){                                
                
                String lista = calculos.mostrarMazo(mazo);
                
                System.out.println("\nUsted posee actualmente: \n");
                System.out.println(lista);
                
            } else if (decision==4) {
                
                String lista = calculos.imprimirPorTipo(mazo);
                
                System.out.println("\nUsted posee actualmente: \n");
                System.out.println(lista);
                
            } else if (decision==5) {
                
               calculos.imprimirTodas();
                
            } else if (decision==6) {
                
               String resultado = calculos.imprimirTipolista();
               System.out.println(resultado);
                
            } else if (decision==7) {
                
                System.out.println("Gracias por utilizar el programa! :)");
                power = false;
                
            } else {
                
                System.err.println("Opcion no valida");
                
            }
        }

    }
    
}

