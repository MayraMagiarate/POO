/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mayra M.F
 */
public class Main {// Clase para iniciar todo
    
    public static void main(String[] args){// Este es el metodo que nos permite inicial todo.
       double Num1,Num2;
       String Numero1=JOptionPane.showInputDialog("Ingrese Un Nùmero Cualquiera: ");
       Num1=Double.parseDouble(Numero1);
       String Numero2=JOptionPane.showInputDialog("Ingrese Otro Nùmero Cualquiera: ");
       Num2=Double.parseDouble(Numero2);
    
    
    Operaciones Operacion1=new Operaciones();    // Aquì creamos el Objeto Operacion1 que es del tipo Operaciones.
    Operacion1.DividirNumeros(Num1, Num2); // Aqui le asignamos al Objeto Operacion1 el metodo Dividir Numeros, que pertenece a la clase Operaciones, o sea, es lo que puede hacer el objeto Operacion1.
    Operacion1.MultiplicarNumeros(Num1, Num2);
    Operacion1.RestarNumeros(Num1, Num2);
    Operacion1.SumarNumeros(Num1,Num2);
    Operacion1.CuadradoDe(Num1);
    Operacion1.MostrarResultados();
    Operacion1.Saludo("Fernando");
     System.out.println(Operacion1.Saludo("Fernando"));
     System.out.println("El cuadrado del Numero 1 es: "+  Operacion1.CuadradoDe(Num1));
    
    
    
    }
    
    
    
}
