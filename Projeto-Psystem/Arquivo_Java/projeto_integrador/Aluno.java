package projeto_integrador;

public class Aluno {
    private int idAluno;
    private String nome;
    private String cpf;
    private int idade;
    private int altura;
    private float peso;
    private double imc;
    private int idProfessor;

    // Construtor com ID do professor
    public Aluno(String nome, String cpf, int idade, int altura, float peso, double imc, int idProfessor) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.idProfessor = idProfessor;
    }

    // Getters e Setters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
}
