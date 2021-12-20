public class Retangulo extends FiguraGeometrica implements AreaDoisParam{

    private double base = 0;
    private double altura = 0;
    private double area = 0;

    public double calculaArea(double base, double altura) {

        return base * altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArea(){
        this.area = calculaArea(getBase(), getAltura());
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea(){
        setArea();
        return area;
    }

}
