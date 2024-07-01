import java.util.Scanner;

public class If_else {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("qual sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        double notaFinal = (nota1 + nota2)/2;

        if (notaFinal >= 7) 
            System.out.println("aprovado");
            
        else if (notaFinal < 7 && notaFinal >= 5)
           System.out.println("recuperação");
        
        else 
           System.out.println("reprovado");
    }
}
