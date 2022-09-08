package ejercicio23lab3;

public class Ejercicio23Lab3 {

    public static void main(String[] args) {
        SumaResta val = new SumaResta(1, 2);
        float s1 = val.suma();
        float r1 = val.resta();
        System.out.printf(s1 + " " + r1);
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
}
