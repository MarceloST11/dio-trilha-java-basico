package metodos;

public class Escola {
    public static void main(String[] args) {

        Aluno marcelo = new Aluno();
        marcelo.setNome("Marcelo");
        marcelo.setIdade(25);

        System.out.println("Meu nome é "+ marcelo.getNome() +" e tenho "+marcelo.getIdade() + " anos de idade." );

        Aluno tavares = new Aluno();
        tavares.setNome("Tavares");
        tavares.setIdade(25);

        System.out.println("Meu nome é "+ tavares.getNome() +" e tenho "+tavares.getIdade() + " anos de idade." );

    }
    
}
 