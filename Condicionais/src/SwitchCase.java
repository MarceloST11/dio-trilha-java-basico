import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("qual operação deseja fazer(somar/diminir/multiplicar/dividir): ");
        String operacao = scanner.next();


        switch (operacao){

            case "somar":{
                int resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            }

            case "diminuir":{
                int resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            }
            case "multiplicar":{
                int resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
            }
            case "dividir":{
                int resultado = numero1 / numero2;
                System.out.println(resultado);
                break;
            }
            default:
                System.out.println("opção invalida");


            



        }

        
    }
}
