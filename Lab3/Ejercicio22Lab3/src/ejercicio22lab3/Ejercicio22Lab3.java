package ejercicio22lab3;

public class Ejercicio22Lab3 {

    public static void main(String[] args) {
        Tubo t = new Tubo();
        Pelota sale;
        Pelota nueva;
        t.verTubo();
        nueva = new Pelota(1003);
        sale = t.meteB(nueva);
        if (sale != null) {
            System.out.print(sale.dameTuSerie() + "<-");
        } else {
            System.out.print(sale + "<-");
        }
        System.out.println("[       ]<-" + 1003);
        t.verTubo();
        nueva = new Pelota(5002);
        sale = t.meteA(nueva);
        System.out.print(5002 + "->[       ]");
        if (sale != null) {
            System.out.println("->" + sale.dameTuSerie());
        } else {
            System.out.println("->" + sale);
        }
        t.verTubo();
        for (int i = 0; i < 5; i++) {
            int s = 14 + i;
            nueva = new Pelota(s);
            sale = t.meteB(nueva);
            if (sale != null) {
                System.out.print(sale.dameTuSerie() + "<-");
            } else {
                System.out.print(sale + "<-");
            }
            System.out.println("[       ]<-" + s);
            t.verTubo();
        }
        for (int i = 0; i < 5; i++) {
            int s = 52 + i;
            nueva = new Pelota(s);
            sale = t.meteA(nueva);
            System.out.print(s + "->[       ]");
            if (sale != null) {
                System.out.println("->" + sale.dameTuSerie());
            } else {
                System.out.println("->" + sale);
            }
            t.verTubo();
        }
    }
}

class Tubo {

    private Pelota pelA;
    private Pelota pelB;

    public Tubo() {
        pelA = null;
        pelB = null;
    }

    public Pelota meteA(Pelota p) {
        if (pelA == null) {
            pelA = p;
            return null;
        } else if (pelB == null) {
            pelB = pelA;
            pelA = p;
            return null;
        } else {
            Pelota aux = pelB;
            pelB = pelA;
            pelA = p;
            return aux;
        }
    }

    public Pelota meteB(Pelota p) {
        if (pelB == null) {
            pelB = p;
            return null;
        } else if (pelA == null) {
            pelA = pelB;
            pelB = p;
            return null;
        } else {
            Pelota aux = pelA;
            pelA = pelB;
            pelB = p;
            return aux;
        }
    }

    public void verTubo() {
        String ver = "A:[";
        if (pelA == null && pelB == null) {
            ver = ver + pelA + "," + pelB + "]:B";
        } else if (pelA == null) {
            ver = ver + pelA + "," + pelB.dameTuSerie() + "]:B";
        } else if (pelB == null) {
            ver = ver + pelA.dameTuSerie() + "," + pelB + "]:B";
        } else {
            ver = ver + pelA.dameTuSerie() + "," + pelB.dameTuSerie() + "]:B";
        }
        System.out.println(ver);
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
