import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando as classes
        Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();

        //Extraindo os dados do Endereco
        System.out.println("==================Endereço==================");

        System.out.println("Digite o logradouro: ");
        endereco.logradouro = scanner.nextLine();

        System.out.println("Digite o número: ");
        endereco.numero = scanner.nextShort();
        scanner.nextLine();

        System.out.println("Digite o complemento: ");
        endereco.complemento = scanner.nextLine();

        System.out.println("Digite o CEP:");
        endereco.cep = scanner.nextLine();

        //Extraindo os dados do cliente
        System.out.println("\n====================Cliente===================");

        System.out.println("\nDigite o nome do cliente: ");
        cliente.nome = scanner.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        cliente.cpf = scanner.nextLine();

        cliente.endereco = endereco;


        //Extraindo os dados da conta corrente
        System.out.println("\n================Conta Corrente================");
        System.out.println("\n Digite o saldo inicial: ");
        contaCorrente.saldo = scanner.nextDouble();

        contaCorrente.titular = cliente;


        //Deposito
        System.out.println("\nValor a depositar na conta corrente: ");
        double depositar = scanner.nextDouble();

        contaCorrente.depositar(depositar);

        System.out.println("Novo saldo: " + contaCorrente.retornarSaldo());

        //Retirar
        System.out.println("\nValor a retirar da conta corrente: ");
        double retirar = scanner.nextDouble();

        contaCorrente.retirar(retirar);

        System.out.println("Novo saldo: " + contaCorrente.retornarSaldo());

        System.out.println("==========Dados do cliente===========");
        System.out.println(cliente.retornarDados());

        System.out.println("=============Endereço==============");
        System.out.println(cliente.endereco.retornarEndereco());

    }
}