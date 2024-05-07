public class MainJuegosGeometricos {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("circulo", 20, 14.5);
        Triangulo triangulo = new Triangulo("triangulo", 15, 15.5);
        System.out.println("----------------------------------");
        System.out.println(circulo.toString());
        System.out.println("----------------------------------");
        System.out.println(triangulo.toString());

    }
}