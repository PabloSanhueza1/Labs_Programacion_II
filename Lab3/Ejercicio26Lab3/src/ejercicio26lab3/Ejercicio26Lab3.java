package ejercicio26lab3;
import java.util.ArrayList;
public class Ejercicio26Lab3 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Deposito{
    public Deposito(){
        
    }
    public void addBebida(Bebida b){
        
    }
    public Bebida getBebida(){
        return
    }
    
}

class Bebida {

    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;

    public Bebida(int s) {
        serie = s;
        contenido = 0;
    }

    public void llenar(int m) {
        if (contenido + m <= Bebida.VOLUMEN) {
            contenido = contenido + m;
        } else {
            contenido = VOLUMEN;
        }
    }

    public int getSerie() {
        return serie;
    }

    public int beber(int b) {
        if (contenido - b >= 0) {
            contenido = contenido - b;
            return b;
        } else {
            int aux = contenido;
            contenido = 0;
            return aux;
        }
    }
}