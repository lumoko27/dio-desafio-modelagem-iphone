package iphone;

import iphone.ferramentas.NavegadorInternet;
import iphone.ferramentas.ReprodutorMusical;
import iphone.ferramentas.AparelhoTelefonico;;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ACESSANDO CORREIO DE VOZ");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: "+ numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA DE NAVEGAÇÃO");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA DA WEB");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("ACESSANDO A URL: " + url);
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO REPRODUÇÂO DE MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }
    
}
