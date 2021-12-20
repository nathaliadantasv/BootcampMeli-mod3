import java.util.List;

public class Utilidades {

    public static double calculaMediaAreas(List<FiguraGeometrica> figuras) {

        double somaAreas = 0;
        int numeroFiguras = figuras.size();

        for (FiguraGeometrica fig : figuras) {
            somaAreas += fig.getArea();
        }

        if (numeroFiguras != 0) {
            return somaAreas / numeroFiguras;
        }
        return 0;
    }
}
