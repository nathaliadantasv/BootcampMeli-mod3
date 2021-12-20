public class Analista extends CLT{

    public static double porcBonificacao = 0.08;
    public static int numMetasBatidas;
    public static double horasTrabalho = 40 * 4;
    public static double horasDescanso = 4 * 4;
    public static double salarioBase = 4000.00;

    public Analista(int numMetasBatidas) {
        super(salarioBase);
        this.numMetasBatidas = numMetasBatidas;
    }

    public double pagarSalario() {
        return super.pagarSalario(this.porcBonificacao, this.numMetasBatidas);
    }
}
