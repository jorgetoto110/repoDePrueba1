/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor7=5;
        int valor5=1;
        int valor =3;    
        String valor2= "juan lo cambie de otro lado";
        double valor3= 25.8;
        boolean valor4= false;
        Scanner teclado= new Scanner(System.in);
        System.out.println("soy re jodido y te lo volví a cambiar");
        valor2= teclado.nextLine();
       sumar(valor7);
      
        System.out.println("Su nombre es: "+valor7);
        
        
    }
    
    static void sumar(int valor){
    valor=valor+20;
    }
}
