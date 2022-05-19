package ContaBancária;

import java.util.*;
public class CadastroDoCliente {
    Scanner scanner = new Scanner(System.in);
    ContaBancaria cliente = new ContaBancaria();
    Map<String, Double> dadosPessoais = new HashMap<>();
    public void cadastrar(){
        System.out.println("Por favor, digite seu nome completo: ");
        String nome = scanner.next();
        System.out.println("Agora digite seu CPF");
        String cpf = scanner.next();
        System.out.println("Informe o valor do seu depósito inicial");
        double saldo = scanner.nextDouble();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSaldo(saldo);
        System.out.println("Cliente cadastrado com sucesso. Bem vindo ao banco do futuro. ");
        System.out.println("Confira os dados cadatrados: Nome - " + cliente.getNome() + " CPF - " + cliente.getCpf());
        dadosPessoais.put(cliente.getCpf(),  cliente.getSaldo());
    }
    public void consultar(){
        System.out.println("Por favor, digite seu CPF: ");
        String cpfUnico2 = scanner.next();
        System.out.println("Seu saldo é: " + dadosPessoais.get(cpfUnico2));
    }
    public void sacar(){
        System.out.println("Por favor, digite seu CPF: ");
        String cpfUnico3 = scanner.next();
        System.out.println("Por favor, digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        double sacado = dadosPessoais.get(cpfUnico3) - valorSaque;
        dadosPessoais.replace(cpfUnico3, sacado);
        System.out.println("O valor retirado da sua conta foi: " + valorSaque);
    }
    public void depositar(){
        System.out.println("Por favor, digite seu cpf: ");
        String cpfUnico4 = scanner.next();
        System.out.println("Por favor, digite o valor que deseja depositar: ");
        double valorDeposito = scanner.nextDouble();
        double depositado = dadosPessoais.get(cpfUnico4) + valorDeposito;
        dadosPessoais.replace(cpfUnico4, depositado);
        System.out.println("O valor do depósito na sua conta foi: " + valorDeposito);
    }

    public void optar(){
        System.out.println("Digite 1 para realizar seu cadastro \n"
                + "Digite 2 para realizar consulta do saldo \n"
                + "Digite 3 para realizar saque \n"
                + "Digite 4 para realizar depósito\n"
                + "Digite 0 para deslogar \n");
    }
}
