package ejercicio42lab4;

import java.util.ArrayList;

public class Ejercicio42Lab4 {

    public static void main(String[] args) {
        Deposito d1 = new Deposito();
        Deposito d2 = new Deposito();

        Sprite s1 = new Sprite(10);
        Sprite s2 = new Sprite(11);
        Sprite s3 = new Sprite(12);

        Fanta f1 = new Fanta(20);
        Fanta f2 = new Fanta(21);
        Fanta f3 = new Fanta(22);

        CocaCola c1 = new CocaCola(30);
        CocaCola c2 = new CocaCola(31);
        CocaCola c3 = new CocaCola(32);

        d1.addBebida(s1);
        d1.addBebida(s2);
        d1.addBebida(s3);

        d2.addBebida(f1);
        d2.addBebida(c1);
        d2.addBebida(f2);
        d2.addBebida(c2);
        d2.addBebida(f3);
        d2.addBebida(c3);

        for (int i = 0; i < 3; i++) {
            Bebida aux = d1.getBebida();
            System.out.println(aux.getSerie() + " " + aux.beber());
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            Bebida aux = d2.getBebida();
            System.out.println(aux.getSerie() + " " + aux.beber());
        }
        Bebida aux = d2.getBebida();
        System.out.println("\n" + aux);
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
        return "sabor: ";
    }

}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "fanta";
    }
}

class Kem extends Bebida {

    public Kem(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "kem";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "cocacola";
    }
}
