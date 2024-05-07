public class Triangulo extends JuegosGeometricos {

    private String figura_geometrica;

    public Triangulo(String figura_geometrica, int area, double perimetro) {
        super(figura_geometrica, area, perimetro);
        this.figura_geometrica = figura_geometrica;
    }

    public String getFigura_geometrica() {
        return figura_geometrica;
    }

    public void setFigura_geometrica(String figura_geometrica) {
        this.figura_geometrica = figura_geometrica;
    }

}