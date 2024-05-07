public class JuegosGeometricos {
    private String figura_geometrica;
    private int area;
    private double perimetro;

    public void setFigura_geometrica(String figura_geometrica) {
        this.figura_geometrica = figura_geometrica;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getFigura_geometrica() {
        return figura_geometrica;
    }

    public int getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public JuegosGeometricos(String figura_geometrica, int area, double perimetro) {
        this.figura_geometrica = figura_geometrica;
        this.area = area;
        this.perimetro = perimetro;

    }

    @Override
    public String toString() {
        return "JuegosGeometricos [figura_geometrica=" + figura_geometrica + ", area=" + area + ", perimetro="
                + perimetro + "]";
    }

}