package ejercicio26lab3;

import java.util.ArrayList;

public class Ejercicio26Lab3 {

    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Bebida b1 = new Bebida(1);
        Bebida b2 = new Bebida(2);
        Bebida b3 = new Bebida(3);
        Bebida b4 = new Bebida(4);
        deposito.addBebida(b1);
        deposito.addBebida(b2);
        deposito.addBebida(b3);
        deposito.addBebida(b4);

        Bebida b5 = deposito.getBebida();
        Bebida b6 = deposito.getBebida();
        
        
    }

}

class Deposito {

    private ArrayList<Bebida> deposito;

    public Deposito() {
        deposito = new ArrayList();
    }

    public void addBebida(Bebida b) {
        deposito.add(b);
    }

    public Bebida getBebida() {
        if (deposito.size() == 0) {
            return null;
        } else {
            Bebida b = deposito.get(0);
            deposito.remove(0);
            return b;
        }
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

    public void beber(int b) {
    }
}
