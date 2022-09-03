/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio10Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida b = new Bebida();
        String s = b.beber();
        System.out.println(s);
    }
    
}

class Bebida{
    public Bebida(){
    }
    public String beber(){
        String s = new String("gluglu");
        return s;
    }
}