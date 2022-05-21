package ContaBancária;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);

        CadastroDoCliente informacoes = new CadastroDoCliente();

        do {
            informacoes.optar();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    informacoes.cadastrar();
                    break;
                case 2:
                    informacoes.consultar();
                    break;
                case 3:
                    informacoes.sacar();
                    break;
                case 4:
                    informacoes.depositar();
                    break;
            }
        } while (escolha != 0);
    }
}
