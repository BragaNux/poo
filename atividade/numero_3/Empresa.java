// Código Brayan

import java.util.ArrayList;
import java.util.List;

public class Empresa 
{
    List<Projeto> projetos;

    public Empresa() 
    {
        projetos = new ArrayList<>();
    }

    public void criarProjeto(Projeto projeto) 
    {
        projetos.add(projeto);
        System.out.println("Projeto criado: " + projeto.nome);
    }

    public void gerarRelatorioProgresso() 
    {
        for (Projeto projeto : projetos) 
        {
            System.out.println("Projeto: " + projeto.nome);
            for (Tarefa tarefa : projeto.tarefas) 
            {
                System.out.println("Tarefa: " + tarefa.nome + " - Estado: " + tarefa.estado);
            }
        }
    }

    public void gerarRelatorioAlocacao() 
    {
        for (Projeto projeto : projetos) 
        {
            System.out.println("Projeto: " + projeto.nome);
            for (Funcionario funcionario : projeto.funcionarios) 
            {
                System.out.println("Funcionário: " + funcionario.nome + " - Cargo: " + funcionario.cargo);
            }
        }
    }
}


// Código chatgpt


import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Projeto> projetos;

    public Empresa() {
        projetos = new ArrayList<>();
    }

    public void criarProjeto(Projeto projeto) {
        projetos.add(projeto);
        System.out.println("Projeto '" + projeto.getNome() + "' criado.");
    }

    public void gerarRelatorioProgresso() {
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNome());
            for (Tarefa tarefa : projeto.getTarefas()) {
                System.out.println("Tarefa: " + tarefa.getNome() + " - Estado: " + tarefa.getEstado());
            }
        }
    }

    public void gerarRelatorioAlocacao() {
        for (Projeto projeto : projetos) {
            System.out.println("Projeto: " + projeto.getNome());
            for (Funcionario funcionario : projeto.getFuncionarios()) {
                System.out.println("Funcionário: " + funcionario.getNome() + " - Cargo: " + funcionario.getCargo());
            }
        }
    }
}
