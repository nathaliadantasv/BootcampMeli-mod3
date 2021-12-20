public class PJ {

    private double horas;
    private double valorHora;
    private double salarioTotal;


    public PJ(double horas, double valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public PJ(){ }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setSalario(){
        this.salarioTotal = pagarSalario(this.getHoras(), this.getValorHora());
    }

    public double getSalario(){
        setSalario();
        return this.salarioTotal;
    }

    public double pagarSalario (double horas, double valorHora){
        return horas * valorHora;
    }
}
