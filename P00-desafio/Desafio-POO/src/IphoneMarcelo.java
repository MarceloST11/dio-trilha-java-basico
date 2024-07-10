public class IphoneMarcelo {
    public static void main(String[] args) {
        Iphone marcelo = new Iphone();

        //Reprodutor Musical
        marcelo.tocar();
        marcelo.pausar();
        marcelo.selecionarMusica("colors");

        //Aparelho Telefonico
        marcelo.ligar("4002-8922");
        marcelo.atender();
        marcelo.iniciarCorreioVoz();

        //Navegador Internet
        marcelo.exibirPagina("marcelobet.com");
        marcelo.atualizarPagina();
        marcelo.adicionarNovaAba();

    }
    
}
