package bruno.apple.iphone7;

import bruno.apple.iphone7.fabrica.Iphone7;
import bruno.apple.iphone7.musica.Mp3;
import bruno.apple.iphone7.telefone.AparelhoTelefonico;

public class IphoneUsuario {
    public static void main(String[] args) {
        Iphone7 iphone7 = new Iphone7();

        AparelhoTelefonico aparelhoTelefonico = iphone7;

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioDeVoz();

    }
}