package asincronico;

public class Circulo {
    private String color;

    private double radio;
    private String tamano;

    public Circulo(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void dibujar(){
        System.out.println("Dibujamos objeto color: " + color);
    }
}
