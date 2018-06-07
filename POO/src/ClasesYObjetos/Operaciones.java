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
public class Operaciones {
    // Atributos
  
    double Suma;// Como estas variables son atributos de la Clase Operaciones, se las llama tambien Variables Globales.
    double Resta; // Todas las variables que esten como atributos de una Clase son Variables Globales.
    double Division;
    double Multiplicacion;
    
    
    
    
    // Metodos
   
    
    //Este Metodo va a hacer que los dos numeros ingresados se sumen pero no va a retornar nada:
    public void SumarNumeros(double Num1,double Num2){
    Suma=Num1+Num2;
    }
    public void MultiplicarNumeros(double Num1,double Num2){
    Multiplicacion=Num1*Num2;
    }
    public void DividirNumeros(double Num1,double Num2){
        if(Num2!=0){
    Division=Num1/Num2;
            }
    }
    public void RestarNumeros(double Num1,double Num2){
    Resta=Num1-Num2;
    }
    public void MostrarResultados(){
    JOptionPane.showMessageDialog(null,"La Suma de los Numeros es:  "+ Suma);
    JOptionPane.showMessageDialog(null,"La Resta de los Numeros es:  "+ Resta);
    JOptionPane.showMessageDialog(null,"La Multiplicacion de los Numeros es:  "+ Multiplicacion);
    JOptionPane.showMessageDialog(null,"La División del Numero 1 por el Nùmero 2 es:  "+ Division);
    
    }
    public double CuadradoDe(double Num1){ // Este es un Metodo que si retorna algo , en este caso un double que serà el cuadrado del Parametro que definimos, o sea Num1
    double Pot2= Math.pow(Num1,2); // Esta es  la operacion que realiza este Metodo.
    return Pot2;// y este es el resultado que entrega el metodo.
    }
    public String Saludo(String Nombre){
    String Saludar="Hola "+Nombre;
    return Saludar;
            }
    
}
