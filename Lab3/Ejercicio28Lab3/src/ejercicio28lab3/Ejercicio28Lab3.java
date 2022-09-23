package ejercicio28lab3;

import java.util.ArrayList;

public class Ejercicio28Lab3 {

    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        Expendedor expendedor = new Expendedor(10);

        Bebida bebida = expendedor.comprarBebida(moneda);

        String s = bebida.beber();
        System.out.println(s);
        System.out.println(bebida.getSerie());
    }
}

class Expendedor {

    private Deposito deposito = new Deposito();

    public Expendedor(int capacidad) {
        for (int i = 0; i < capacidad; i++) {
            Bebida bebida = new Bebida(i);
            deposito.addBebida(bebida);
        }
    }

    public Bebida comprarBebida(Moneda moneda) {
        Bebida bebida = deposito.getBebida();
        return bebida;
    }
}

class Deposito {

    private ArrayList<Bebida> deposito;

    public Deposito() {
        deposito = new ArrayList();
    }

    public void addBebida(Bebida bebida) {
        deposito.add(bebida);
    }

    public Bebida getBebida() {
        if (deposito.size() == 0) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
}

class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {

        return "gluglu";
    }
}

class Moneda {

    public Moneda() {

    }
}