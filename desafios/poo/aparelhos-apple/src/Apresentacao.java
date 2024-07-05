import aparelhos.iphone.Iphone;
import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorInternet.NavegadorInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Apresentacao {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        String numero = "61 95432-1234";
        String url = "https://www.google.com/";
        String musica = "Sleep Token - The offering";

        System.out.println("Reprodutor musical \n");
        ReprodutorMusical reprodutorMusical = iphone;
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        System.out.println(" ");

        System.out.println("Aparelho Telefônico \n");
        AparelhoTelefonico aparelhoTelefonico = iphone;
        aparelhoTelefonico.ligar(numero);
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Navegador de Internet \n");
        NavegadorInternet navegadorInternet = iphone;
        navegadorInternet.exibirPagina(url);
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        System.out.println(" ");

    }
}
