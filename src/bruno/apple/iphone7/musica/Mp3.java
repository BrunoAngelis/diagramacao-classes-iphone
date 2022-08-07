package bruno.apple.iphone7;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mp3 implements ReprodutorMusical {


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
}
