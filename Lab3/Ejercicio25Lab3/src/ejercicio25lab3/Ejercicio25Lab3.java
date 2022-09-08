package ejercicio25lab3;

public class Ejercicio25Lab3 {

    public static void main(String[] args) {
        Bebida b = new Bebida(18);
        b.llenar(1211);
        Bebida bb = new Bebida(19);
        bb.llenar(200);
        Bebida bbb = new Bebida(20);
        bbb.llenar(500);
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
