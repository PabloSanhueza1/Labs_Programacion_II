/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio14Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Promediador prom = new Promediador();
        prom.agregaNumero(1);
        int num = prom.numero();
        float promedio = prom.promedio();
        System.out.println(promedio);
    }

}

class Promediador {

    private int s;
    private int n;

    public Promediador() {
        s = 0;
        n = 0;
    }

    public void agregaNumero(int in1) {
        n = n+1;
        s = s + in1;
    }

    public float promedio() {
        float promedio = (float)s / (float)n;
        return promedio;
    }

    public int numero() {
        int aux = n;
        return aux;
    }

}
