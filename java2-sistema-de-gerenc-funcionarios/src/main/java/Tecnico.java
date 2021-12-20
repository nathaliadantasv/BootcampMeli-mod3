public class Tecnico extends CLT{

    public static double porcBonificacao = 0.05;
    public static int numMetasBatidas;
    public static double horasTrabalho = 40 * 4;
    public static double horasDescanso = 0;
    public static double salarioBase = 3200.00;

    public Tecnico(int numMetasBatidas) {
        super(salarioBase);
        this.numMetasBatidas = numMetasBatidas;
    }

    public double pagarSalario() {
        return super.pagarSalario(this.porcBonificacao, this.numMetasBatidas);
    }
}
