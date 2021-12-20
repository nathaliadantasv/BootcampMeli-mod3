public class Principal {

    public static void main(String[] args) {

        PJ pj1 = new PJ(40, 50);
        System.out.println(pj1.getSalario());

        Tecnico tecnico = new Tecnico(2);
        System.out.println(tecnico.pagarSalario());
    }
}
