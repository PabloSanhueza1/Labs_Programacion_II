/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12lab2;

/**
 *
 * @author Pablo Sanhueza
 */
public class Ejercicio12Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("textoDelString",true);
        boolean casado = persona.esCasado();
        String nombre = persona.elNombre();
    }
}

class Persona{
    
    private String nombre;
    private boolean estado;
    
    public Persona(String name, boolean valor){
        nombre = name;
        estado = valor;
    }
    public boolean esCasado(){
        return estado;
    }
    public String elNombre(){
        String s = nombre;
        return s;
    }
}