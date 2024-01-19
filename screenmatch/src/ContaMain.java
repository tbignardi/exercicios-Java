public class ContaMain {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1234);
        conta.setSaldo(100000);
        conta.titular = "Thiago";

        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(200000);
        System.out.println("Seu saldo atual é: " + conta.getSaldo());
    }
}
