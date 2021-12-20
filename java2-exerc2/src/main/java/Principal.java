import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        Retangulo retangulo1 = new Retangulo();
        retangulo1.setBase(10);
        retangulo1.setAltura(10);
        retangulo1.getArea();

        Triangulo triangulo1 = new Triangulo();
        triangulo1.setBase(4);
        triangulo1.setAltura(3);
        triangulo1.getArea();

        Circulo circulo1 = new Circulo();
        circulo1.setRaio(2);
        circulo1.getArea();

        figuras.add(retangulo1);
        figuras.add(triangulo1);
        figuras.add(circulo1);

        Utilidades util = new Utilidades();

        System.out.println("Média das áreas: " + util.calculaMediaAreas(figuras));

    }
}
