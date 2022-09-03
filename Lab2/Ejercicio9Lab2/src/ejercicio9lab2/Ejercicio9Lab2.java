/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio9Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrimeraClase p = new PrimeraClase("blabla");
        String s= p.getString();
        System.out.println(s);
    }
}

class PrimeraClase {
    private String palabra;
    public PrimeraClase(String s){
        palabra = s;
    }
    public String getString(){
        return palabra;
    }
}