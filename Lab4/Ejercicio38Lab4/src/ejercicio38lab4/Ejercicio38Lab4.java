package ejercicio38lab4;

public class Ejercicio38Lab4 {

    public static void main(String[] args) {
        CuatroOperaciones res = new CuatroOperaciones(2, 5);
        float m = res.suma();
        System.out.println(m);
    }
}

class SumaResta {

    protected float uno;
    protected float dos;

    public SumaResta() {

    }

    public float suma() {
        return uno + dos;
    }

    public float resta() {
        return uno - dos;
    }
}

class CuatroOperaciones extends SumaResta {

    public CuatroOperaciones(float uno, float dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public float multiplica() {
        return uno * dos;
    }

    public float divide() {
        return uno / dos;
    }
}
