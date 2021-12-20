public class Gerente extends CLT{

    public static double porcBonificacao = 0.125;
    public static int numMetasBatidas;
    public static double horasTrabalho = 36 * 4;
    public static double horasDescanso = 4 * 4;
    public static double salarioBase = 6000.00;

    public Gerente(int numMetasBatidas) {
        super(salarioBase);
        this.numMetasBatidas = numMetasBatidas;
    }

    public double pagarSalario() {
        return super.pagarSalario(this.porcBonificacao, this.numMetasBatidas);
    }
}
