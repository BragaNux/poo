// Código Brayan

public class Tarefa 
{
    String nome;
    String descricao;
    int duracaoEstimada;
    String estado; // não é bool pois pode ser novo, em andamento e concluido.

    public Tarefa(String nome, String descricao, int duracaoEstimada, String estado) 
    {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEstimada = duracaoEstimada;
        this.estado = estado;
    }
}


// Código chatgpt

public class Tarefa {
    private String nome;
    private String descricao;
    private int duracaoEstimada;
    private String estado; // novo, em andamento, concluído

    public Tarefa(String nome, String descricao, int duracaoEstimada, String estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEstimada = duracaoEstimada;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
