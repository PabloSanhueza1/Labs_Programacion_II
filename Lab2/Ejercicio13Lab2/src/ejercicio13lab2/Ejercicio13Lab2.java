/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio13Lab2 {

    public static void main(String[] args) {
        Bebida b1 = new Bebida(true);
        String s = b1.beber();
        System.out.println(s);
        b1 = new Bebida(false);
        String s2 = b1.beber();
        System.out.println(s2);
    }

}

class Bebida {

    private boolean llena;

    public Bebida(boolean valor) {
        llena = valor;
    }

    public String beber() {
        String s;
        if (llena) {
            s = new String("gluglu");
            llena = false;
        } else {
            s = null;
        }
        return s;
    }
}
