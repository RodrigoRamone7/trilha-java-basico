package aparelhos.iphone;

import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorInternet.NavegadorInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Grave seu correio de voz após o Bipe...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando site: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta...");
        System.out.println("Insira uma nova url.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando: " + musica);
    }
}

