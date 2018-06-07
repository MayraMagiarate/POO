/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author Mayra M.F
 */
public class Vaso {// Una Clase debe tener Atributos y Metodos para ser una verdadera clase.
    String Material;// Primer Atributo 
    String Color;// Segundo Atributo
    double DiamBase;// Tercer Atributo ...
    double DiamBoca;
    double Altura;
    double Capacidad;
    
    /** ahora vamos a crear Metodos para esta Clase, o sea acciones que puede hacer el objeto 
     Empezando por la clase Main, para que podamos iniciar
     * 
     **/
    public static void main ( String [] args){
        Vaso TragoLargo =new Vaso();
        TragoLargo.Material="Vidrio";
        TragoLargo.DiamBase=0.2;// Asì vamos llenando o diciendo como son los atributos del objeto Trago Largo de la clase vaso.
        TragoLargo.DiamBoca=0.2;
        TragoLargo.Altura=0.8;
        TragoLargo.Color="Transparente";
        TragoLargo.Capacidad=(3.1416*TragoLargo.DiamBoca*TragoLargo.Altura);
           
        System.out.println("El Objeto Vaso de Trago Largo tiene los siguentes Atributos: "+"Es de "+TragoLargo.Material+", "+TragoLargo.Color+", con una Capacidad de: "+TragoLargo.Capacidad+" cm3.");
        
    }
    
}// Fin de la Clase Vaso.
