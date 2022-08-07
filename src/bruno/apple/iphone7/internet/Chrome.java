package bruno.apple.iphone7.internet;

public class Chrome implements NavegadoroInternet{
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
}
