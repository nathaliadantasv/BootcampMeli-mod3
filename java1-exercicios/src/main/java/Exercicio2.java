public class Exercicio2 {

    public static void main(String[] args){

        double valorEmpresaX = 1.13 * Math.pow(10,6);
        double valorEmpresaY = 18.4 * Math.pow(10,6);
        double txAnualEmpresaX = 1.48;
        double txAnualEmpresaY = 0.32;
        int ano = 2021;

        while(valorEmpresaX < valorEmpresaY) {
            System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaX + "m");
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaY + "m");
            System.out.println("-------------------------------------------------------------------");

            ano += 1;
            valorEmpresaX += (valorEmpresaX * txAnualEmpresaX);
            valorEmpresaY += (valorEmpresaY * txAnualEmpresaY);
        }
        System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaX + "m");
        System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaY + "m");
        System.out.println("-------------------------------------------------------------------");
    }

}
