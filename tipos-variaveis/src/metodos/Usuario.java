package metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("no status: "+ smartTv.ligada);

        smartTv.mudarCanal(5);
        System.out.println("novo canal: "+ smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("novo volume: "+ smartTv.volume);
    }
}
