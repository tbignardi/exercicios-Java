public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Thiago", 10.0,9.5,8.0);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " +aluno1.calcularMedia());

    }
}

