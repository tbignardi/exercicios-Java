public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Laysa";
        pessoa1.idade = 29;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos ");
        pessoa1.fazAniversario();
        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos ");
    }
}
