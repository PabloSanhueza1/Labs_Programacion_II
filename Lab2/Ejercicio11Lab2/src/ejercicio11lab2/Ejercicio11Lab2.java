/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio11Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OtraClase n = new OtraClase(10);
        int x = n.sacaDato();
        System.out.println(x);
    }
    
}
class OtraClase {
    private int n;
    public OtraClase(int x){
        n = x;
    }
    public int sacaDato(){
        return n;
    }
}