// Código Brayan

import java.util.ArrayList;
import java.util.List;

public class Projeto 
{
    String nome;
    String dataInicio;

    List<Tarefa> tarefas;
    List<Funcionario> funcionarios;

    public Projeto(String nome, String dataInicio) 
    {
        this.nome = nome;
        this.dataInicio = dataInicio;

        this.tarefas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) 
    {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada ao projeto: " + nome);
    }

    public void alocarFuncionario(Funcionario funcionario) 
    {
        funcionarios.add(funcionario);
        System.out.println("Funcionário alocado ao projeto: " + nome);
    }
}


// Código chatgpt


import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String dataInicio;
    private List<Tarefa> tarefas;
    private List<Funcionario> funcionarios;

    public Projeto(String nome, String dataInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.tarefas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa '" + tarefa.getNome() + "' adicionada ao projeto: " + nome);
    }

    public void alocarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário '" + funcionario.getNome() + "' alocado ao projeto: " + nome);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
