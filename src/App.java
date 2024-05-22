import iphone.Iphone;

public class App {
  public static void main(String[] args) {
    Iphone aparelho = new Iphone();

    aparelho.adicionarNovaAba();
    aparelho.exibirPagina("www.google.com");
    aparelho.atualizarPagina();

    aparelho.iniciarCorreioVoz();
    aparelho.atender();
    aparelho.ligar("12345-67890");

    aparelho.selecionarMusica("Xuxa - Só para Baixinhos");
    aparelho.pausar();
    aparelho.tocar();
  }
}
