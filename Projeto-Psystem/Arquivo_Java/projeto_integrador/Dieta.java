package projeto_integrador;

public class Dieta {
    private int idDieta; // ID da dieta (chave primária)
    private String tipoDieta; // Tipo de dieta (ex: vegetariana, low carb)
    private String comida; // Detalhes da comida recomendada
    private int idAluno; // ID do aluno associado à dieta (chave estrangeira)

    // Construtor padrão
    public Dieta() {
    }

    // Construtor completo
    public Dieta(String tipoDieta, String comida, int idAluno) {
        if (tipoDieta == null || tipoDieta.isEmpty()) {
            throw new IllegalArgumentException("O tipo de dieta não pode ser vazio.");
        }
        if (comida == null || comida.isEmpty()) {
            throw new IllegalArgumentException("A comida não pode ser vazia.");
        }
        if (idAluno <= 0) {
            throw new IllegalArgumentException("O ID do aluno deve ser maior que zero.");
        }
        this.tipoDieta = tipoDieta;
        this.comida = comida;
        this.idAluno = idAluno;
    }

    // Getters e Setters
    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        if (tipoDieta == null || tipoDieta.isEmpty()) {
            throw new IllegalArgumentException("O tipo de dieta não pode ser vazio.");
        }
        this.tipoDieta = tipoDieta;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        if (comida == null || comida.isEmpty()) {
            throw new IllegalArgumentException("A comida não pode ser vazia.");
        }
        this.comida = comida;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        if (idAluno <= 0) {
            throw new IllegalArgumentException("O ID do aluno deve ser maior que zero.");
        }
        this.idAluno = idAluno;
    }

    // Método toString para exibição amigável
    @Override
    public String toString() {
        return "Dieta{" +
                "idDieta=" + idDieta +
                ", tipoDieta='" + tipoDieta + '\'' +
                ", comida='" + comida + '\'' +
                ", idAluno=" + idAluno +
                '}';
    }
}
