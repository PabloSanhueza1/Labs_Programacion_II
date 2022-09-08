package ejercicio20lab3;

public class Ejercicio20Lab3 {

    public static void main(String[] args) {
        Pelota p = new Pelota(5);
        int s = p.dameTuSerie();
        System.out.println(s);
    }
}

class Pelota{
    private int serie;
    public Pelota(int s){
        serie = s;
    }
    public int dameTuSerie(){
        return serie;
    }
}