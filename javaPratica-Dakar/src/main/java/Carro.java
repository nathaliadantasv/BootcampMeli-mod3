public class Carro extends Veiculo{

    private static int rodas = 4;
    private static double peso = 1000;

    public Carro(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, rodas);
    }
}
