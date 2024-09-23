// CÓDIGO BRAYAN

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca 
{
    List<Livro> livros;
    List<Emprestimo> emprestimos;

    public Biblioteca() 
    {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) 
    {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void registrarEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) 
    {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
        livro.disponivel = false;
        System.out.println("Empréstimo registrado com sucesso!");
    }

    public void listarLivrosDisponiveis() 
    {
        System.out.println("Segue livros disponíveis: ");
        for (Livro livro : livros) 
        {
            if (livro.disponivel) 
            {
                System.out.println(livro.titulo);
            }
        }
    }

    public void listarLivrosEmprestados() 
    {
        System.out.println("Segue livros emprestados: ");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo.livro.titulo + " está com " + emprestimo.usuario.nome);
        }
    }
}

// CÓDIGO CHATGPT

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void registrarEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: " + livro.getTitulo() + " para " + usuario.getNome());
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados:");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo.getLivro().getTitulo() + " emprestado para " + emprestimo.getUsuario().getNome());
        }
    }
}
