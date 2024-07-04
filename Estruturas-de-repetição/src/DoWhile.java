import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta = "";

       do {
            System.out.println("escolha uma alternativa:\n 1- \n 2- \n 3- \n 4- \n sair");
            resposta = scanner.next();
            System.out.println("resposta correta !");
         
        }
        while (resposta != "sair");
        
        System.out.println("progama finalizado");
        scanner.close();
    }
    
}
