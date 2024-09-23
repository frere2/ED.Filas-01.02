package view;

import br.edu.fateczl.thiago.fila.Fila;
import controller.FilaController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        FilaController filaController = new FilaController();
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(); // Fila de não prioritários
        Fila filaPrioritarios = new Fila(); // Fila de prioritários

        int escolha;
        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir senha prioritária");
            System.out.println("2. Inserir senha não prioritária");
            System.out.println("3. Chamar próximo cliente");
            System.out.println("4. Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    filaController.inserirSenha(filaPrioritarios);
                    break;
                case 2:
                    filaController.inserirSenha(fila);
                    break;
                case 3:
                    filaController.chamarProximo(fila, filaPrioritarios);
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 4);

        scanner.close();
    }
}
