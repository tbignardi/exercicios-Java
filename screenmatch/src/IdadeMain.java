public class IdadeMain {

    public static void main(String[] args) {

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Thiago");
        pessoa1.setIdade(31);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Laysa");
        pessoa2.setIdade(29);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos. ");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos. ");
        pessoa2.verificarIdade();

    }
}
