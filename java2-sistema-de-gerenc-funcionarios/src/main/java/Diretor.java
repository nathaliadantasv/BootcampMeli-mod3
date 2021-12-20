public class Diretor extends CLT{

    public static double porcLucro = 0.03;
    public static double lucroTotal;
    public static double salarioBase = 15000.0;

    public Diretor(double lucroTotal) {
        super(salarioBase);
        this. lucroTotal = lucroTotal;
    }

    public double pagarSalario() {
        return salarioBase + (porcLucro * lucroTotal);
    }
}
