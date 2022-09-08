package ejercicio24lab3;

public class Ejercicio24Lab3 {

    public static void main(String[] args) {
        CuatroOperaciones v = new CuatroOperaciones(1, 2);
        System.out.println(v.multiplica());
        System.out.println(v.divide());
        System.out.println(v.suma());
        System.out.println(v.resta());
    }
}

class CuatroOperaciones {

    SumaResta v;

    public CuatroOperaciones(float a, float b) {
        v = new SumaResta(a, b);
    }

    public float multiplica() {
        return v.getUno() * v.getDos();
    }

    public float divide() {
        return v.getUno() / v.getDos();
    }

    public float suma() {
        return v.suma();
    }

    public float resta() {
        return v.resta();
    }
}

class SumaResta {

    private float uno;
    private float dos;

    public SumaResta(float a, float b) {
        uno = a;
        dos = b;
    }

    public float suma() {
        return uno + dos;
    }

    public float resta() {
        return uno - dos;
    }

    public float getUno() {
        return uno;
    }

    public float getDos() {
        return dos;
    }
}
