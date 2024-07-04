public class ExemoloForArray {
    public static void main(String[] args) {
        String alunos [] = {"Marcelo", "Claudenice", "Auristela", "Kelly"};

        for(int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno na posição "+x+" é "+ alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("O nome do launo é: "+ aluno);
        }
    }
}
