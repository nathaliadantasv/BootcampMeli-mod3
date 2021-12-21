import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro salvaVidaCarro;
    private SocorristaMoto salvaVidaMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos){
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.salvaVidaCarro = new SocorristaCarro();
        this.salvaVidaMoto = new SocorristaMoto();
    }

    public void registraCarro(int velocidade, int aceleracao, double anguloDeGiro, String placa){
        int quantidadeAtual = listaVeiculos.size();
        if(quantidadeAtual < quantidadeVeiculosPermitidos){
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }else{
            System.out.println("Não é possível registrar mais carros. A quantidade de veículos permita já foi atingida.");
       }
    }

    public void registraMoto(int velocidade, int aceleracao, double anguloDeGiro, String placa){
        int quantidadeAtual = listaVeiculos.size();
        if(quantidadeAtual < quantidadeVeiculosPermitidos){
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }else{
            System.out.println("Não é possível registrar mais carros. A quantidade de veículos permita já foi atingida.");
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        Stream<Veiculo> veiculoCorrespondente = listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca() == placa);
        listaVeiculos.remove(veiculoCorrespondente);
    }

    public Veiculo determinaVencedor(List<Veiculo> listaVeiculos){
        double maiorVelocidade = 0;
        Veiculo veiculo = null;

        for(Veiculo v : listaVeiculos){
            double resultado = (v.getVelocidade() * v.getAceleracao()) / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if(resultado > maiorVelocidade){
                maiorVelocidade = resultado;
                veiculo = v;
            }
        }

        return veiculo;
    }

    public void socorrerCarro(String documento){
    }

    public void socorrerMoto(String documento){
    }

}
