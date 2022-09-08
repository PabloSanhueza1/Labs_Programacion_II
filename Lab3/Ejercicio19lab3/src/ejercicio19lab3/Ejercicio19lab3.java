package ejercicio19lab3;

public class Ejercicio19lab3 {

    public static void main(String[] args) {
        Balde b = new Balde(12);
        b.llenar(7);
        System.out.println("tiene: " + b.verificar());
        b.llenar(9);
        System.out.println("tiene: " + b.verificar());
        b.llenar(-6);
        System.out.println("tiene: " + b.verificar());
        System.out.println(b.vaciar(3));
        System.out.println("tiene: " + b.verificar());
        System.out.println(b.vaciar(-8));
        System.out.println("tiene: " + b.verificar());
        System.out.println(b.vaciar(16));
        System.out.println("tiene: " + b.verificar());
    }
}

class Balde {

    private int capacidad;
    private int contenido;

    public Balde(int c) {
        capacidad = c;
        contenido = 0;
    }

    public void llenar(int c) {
        if (c >= 0) {
            if (contenido + c <= capacidad) {
                contenido = contenido + c;
            } else {
                contenido = capacidad;
            }
        }
    }

    public int verificar() {
        return contenido;
    }

    public int vaciar(int c) {
        if (c >= 0) {
            if (contenido - c >= 0) {
                contenido = contenido - c;
            } else {
                contenido = 0;
            }
            return contenido;
        } else {
            return 0;
        }
    }
}
