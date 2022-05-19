package ContaBancária;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int esc;
        Scanner scanner = new Scanner(System.in);

        CadastroDoCliente informacoes = new CadastroDoCliente();

        do {
            informacoes.optar();
            esc = scanner.nextInt();

            switch (esc) {
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
        } while (esc != 0);
    }
}