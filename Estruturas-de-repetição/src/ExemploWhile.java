import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta = "";

       while (resposta != "sair") {
            System.out.println("escolha uma alternativa:\n 1- \n 2- \n 3- \n 4- \n sair");
            resposta = scanner.next();

            if (resposta.equals("sair")){
                System.out.println("progama encerrado !");
                break;
            }

            System.out.println("resposta correta !");
         
        }

    }
}
