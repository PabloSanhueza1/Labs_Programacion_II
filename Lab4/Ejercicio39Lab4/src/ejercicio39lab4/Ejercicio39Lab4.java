package ejercicio39lab4;

public class Ejercicio39Lab4 {

    public static void main(String[] args) {
        CuatroOperaciones res = new CuatroOperaciones(1, 2);
        float m;
        m = res.suma();
        System.out.println(m);
        m = res.resta();
        System.out.println(m);
        m = res.divide();
        System.out.println(m);
        m = res.multiplica();
        System.out.println(m);
    }
}

class SumaResta {

    private float uno;
    private float dos;

    public SumaResta(float uno, float dos) {
        this.uno = uno;
        this.dos = dos;
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

class CuatroOperaciones extends SumaResta {

    public CuatroOperaciones(float uno, float dos) {
        super(uno, dos);
    }

    public float multiplica() {
        float uno = getUno();
        float dos = getDos();
        return uno * dos;
    }

    public float divide() {
        float uno = getUno();
        float dos = getDos();
        return uno / dos;
    }
}
