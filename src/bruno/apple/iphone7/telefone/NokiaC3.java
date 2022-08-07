package bruno.apple.iphone7;

public class NokiaC3 implements AparelhoTelefonico{

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
