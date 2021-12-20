public class Circulo extends FiguraGeometrica implements AreaUmParam{

    private double raio = 0;
    private double area = 0;

    public double calculaArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setArea() {
        this.area = calculaArea(getRaio());
    }

    public double getArea() {
        setArea();
        return area;
    }
}
