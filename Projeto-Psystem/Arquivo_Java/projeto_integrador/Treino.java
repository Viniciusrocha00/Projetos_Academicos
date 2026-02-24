package projeto_integrador;

public class Treino {
    private int idTreino;
    private String grupoMuscular;
    private String exercicios;
    private int idAluno;

    // Construtor padrão
    public Treino() {
    }

    // Construtor completo
    public Treino(String grupoMuscular, String exercicios, int idAluno) {
        this.grupoMuscular = grupoMuscular;
        this.exercicios = exercicios;
        this.idAluno = idAluno;
    }

    // Getters e Setters
    public int getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(int idTreino) {
        this.idTreino = idTreino;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        if (grupoMuscular == null || grupoMuscular.isEmpty()) {
            throw new IllegalArgumentException("Grupo muscular não pode ser vazio.");
        }
        this.grupoMuscular = grupoMuscular;
    }

    public String getExercicios() {
        return exercicios;
    }

    public void setExercicios(String exercicios) {
        if (exercicios == null || exercicios.isEmpty()) {
            throw new IllegalArgumentException("Exercícios não podem ser vazios.");
        }
        this.exercicios = exercicios;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        if (idAluno <= 0) {
            throw new IllegalArgumentException("ID do aluno deve ser maior que zero.");
        }
        this.idAluno = idAluno;
    }

    // Método toString para depuração
    @Override
    public String toString() {
        return "Treino{" +
                "idTreino=" + idTreino +
                ", grupoMuscular='" + grupoMuscular + '\'' +
                ", exercicios='" + exercicios + '\'' +
                ", idAluno=" + idAluno +
                '}';
    }
}
