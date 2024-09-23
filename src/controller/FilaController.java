package controller;

import br.edu.fateczl.thiago.fila.Fila;

public class FilaController {
    private int contadorPrioritarios = 0;

    public void inserirSenha(Fila<String> fila) {
        String senha = "Senha" + (fila.size() + 1);
        fila.insert(senha);
        System.out.println("Senha " + senha + " inserida.");
    }

    public void chamarProximo(Fila<String> fila, Fila<String> filaPrioritarios) throws Exception {
        if (!filaPrioritarios.isEmpty() && contadorPrioritarios < 3) {
            System.out.println("Atendendo prioritário: " + filaPrioritarios.remove());
            contadorPrioritarios++;
        } else if (!fila.isEmpty()) {
            System.out.println("Atendendo não prioritário: " + fila.remove());
            contadorPrioritarios = 0;
        } else if (!filaPrioritarios.isEmpty()) {
            System.out.println("Atendendo prioritário: " + filaPrioritarios.remove());
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }
}