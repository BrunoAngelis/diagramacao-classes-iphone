package bruno.apple.iphone7.telefone;

public class MotorolaV3 implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDIDO");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("CORREIO DE VOZ");
    }
}
