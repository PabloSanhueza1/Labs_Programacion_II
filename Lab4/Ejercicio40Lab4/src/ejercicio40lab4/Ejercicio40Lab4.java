package ejercicio40lab4;

public class Ejercicio40Lab4 {

    public static void main(String[] args) {
    }
}

class CreaYPruebaBebida {

    public static void pruebaVeSerieBebe(int que, int serie) {
        Bebida b = null;
        switch (que) {
            case 1:
                b = new Sprite(serie);
                break;
            case 2:
                b = new Fanta(serie);
                break;
            case 3:
                b = new Kem(serie);
                break;
            case 4:
                b = new CocaCola(serie);
                break;
            default:
                return;
        }
        System.out.println(b.getSerie() + ": " + b.beber());
    }
}

abstract class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();

}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return "fanta";
    }
}

class Kem extends Bebida {

    public Kem(int serie) {
        super(serie);
    }

    public String beber() {
        return "kem";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return "cocacola";
    }
}
