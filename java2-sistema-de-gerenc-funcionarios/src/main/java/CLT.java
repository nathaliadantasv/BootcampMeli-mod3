public abstract class CLT {

    public double salarioBase;


    public CLT(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double pagarSalario(double porcBonificacao, int numMetasBatidas){
        return salarioBase + ((porcBonificacao * numMetasBatidas) * salarioBase);
    }


}
