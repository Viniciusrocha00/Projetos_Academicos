package projeto_integrador;

public class Professor {
    private int idProfessor;
    private String nome;
    private String cpf;

    // Construtor com ID
    public Professor(int idProfessor, String nome, String cpf) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Construtor sem ID
    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
