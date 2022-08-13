package presencial;

public class Computadora {
    private String id;
    private int ram;
    private int disco;
    private static int contador;

    public Computadora(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
        contador++;
    }
    @Override
    public String toString(){
        return "Computadora [ram:" +ram + ", disco: "+disco+ " ]";
    }

    public static int getContador() {
        return contador;
    }
}
