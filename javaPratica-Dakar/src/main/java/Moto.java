public class Moto extends Veiculo {

    private static int rodas = 2;
    private static double peso = 300;

    public Moto(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, peso, rodas);
    }

}
