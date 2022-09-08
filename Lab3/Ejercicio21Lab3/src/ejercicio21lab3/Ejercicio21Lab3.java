package ejercicio21lab3;

public class Ejercicio21Lab3 {

    public static void main(String[] args) {
        EnvaseCarton ec = new EnvaseCarton();
        Pelota p1 = new Pelota(20);
        Pelota r1 = ec.metePelota(p1);
        if (p1 == r1) {
            System.out.println("NO entro" + ": " + p1.dameTuSerie());

        } else {
            System.out.println("SI entro" + ": " + p1.dameTuSerie());

        }
        Pelota p2 = new Pelota(52);
        Pelota r2 = ec.metePelota(p2);
        if (p2 == r2) {
            System.out.println("NO entro" + ": " + p2.dameTuSerie());

        } else {
            System.out.println("SI entro" + ": " + p2.dameTuSerie());

        }
        Pelota saca1 = ec.damePelota();
        if (saca1 != null) {
            System.out.println(saca1.dameTuSerie());
        } else {
            System.out.println(saca1);
        }
        Pelota saca2 = ec.damePelota();
        if (saca2 != null) {
            System.out.println(saca2.dameTuSerie());
        } else {
            System.out.println(saca2);
        }
    }
}

class EnvaseCarton {

    private Pelota pel;

    public EnvaseCarton() {
        pel = null;
    }

    public Pelota metePelota(Pelota p) {
        if (pel == null) {
            pel = p;
            return null;
        } else {
            return p;
        }
    }

    public Pelota damePelota() {
        if (pel == null) {
            return null;
        } else {
            Pelota aux = null;
            aux = pel;
            pel = null;
            return aux;
        }
    }
}

class Pelota {

    private int serie;

    public Pelota(int s) {
        serie = s;
    }

    public int dameTuSerie() {
        return serie;
    }
}
