public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet  {
    //Aparelho Telefonico
    public void ligar(String numero){
        System.out.println("ligando para o numero: " + numero);
    }

    public void atender(){
        System.out.println("atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Inicinado correio de voz");
    }

    //Reprodutor Musical

    public void tocar(){
        System.out.println("tocando musica");
    }
    public void pausar(){
        System.out.println("pausando musica");
    }
    public void selecionarMusica(String musica){
        System.out.println("Exibindo musica "+ musica);
    }

    //Navegador Internet

    public void exibirPagina(String url){
        System.out.println("exibindo pagina: "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("adicionado nova aba");
    }
    public void atualizarPagina(){
        System.out.println("atualizando pagina");
    }
    
    



}
