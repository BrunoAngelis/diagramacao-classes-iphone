package bruno.apple.iphone7;

public class Ipod implements ReprodutorMusical{
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
