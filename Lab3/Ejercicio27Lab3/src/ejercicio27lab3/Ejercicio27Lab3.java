package ejercicio27lab3;

public class Ejercicio27Lab3 {

    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        Expendedor expendedor = new Expendedor();

        Bebida bebida = expendedor.comprarBebida(moneda);
        String s = bebida.beber();
        System.out.println(s);
    }
}

class Expendedor {

    public Expendedor() {

    }

    public Bebida comprarBebida(Moneda moneda) {
        Bebida bebida = new Bebida();
        return bebida;
    }
}

class Bebida {

    public Bebida() {

    }

    public String beber() {

        return "gluglu";
    }
}

class Moneda {

    public Moneda() {

    }
}