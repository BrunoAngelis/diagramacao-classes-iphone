package bruno.apple.iphone7.fabrica;

import bruno.apple.iphone7.internet.NavegadoroInternet;
import bruno.apple.iphone7.musica.ReprodutorMusical;
import bruno.apple.iphone7.telefone.AparelhoTelefonico;

public class Iphone7 implements ReprodutorMusical, AparelhoTelefonico, NavegadoroInternet {
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("PAGINA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");
    }

    @Override
    public void tocarMusia() {
        selecionarMusica();
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pararMusica() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MUSICA SELECIONADA");
    }


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
