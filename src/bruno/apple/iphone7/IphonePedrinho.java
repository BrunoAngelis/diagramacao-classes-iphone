package bruno.apple.iphone7;

import bruno.apple.iphone7.fabrica.Iphone7;
import bruno.apple.iphone7.internet.NavegadoroInternet;
import bruno.apple.iphone7.musica.ReprodutorMusical;
import bruno.apple.iphone7.telefone.AparelhoTelefonico;

public class IphonePedrinho {
    public static void main(String[] args) {
        Iphone7 iphone7 = new Iphone7();


        AparelhoTelefonico aparelhoTelefonico = iphone7;


        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        System.out.println("------------------------------");

        NavegadoroInternet navegador = iphone7;

        navegador.adicionarNovaPagina();
        navegador.exibirPagina();
        navegador.atualizarPagina();

        System.out.println("--------------------------------");

        ReprodutorMusical reprodutorMusical = iphone7;

        reprodutorMusical.tocarMusia();
        reprodutorMusical.pararMusica();
        reprodutorMusical.selecionarMusica();

    }
}