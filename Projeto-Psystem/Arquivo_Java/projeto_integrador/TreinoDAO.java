package projeto_integrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TreinoDAO {

    public boolean cadastrarTreino(Treino treino) {
        String sql = "INSERT INTO treino (grupo_muscular, exercicios, id_aluno) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, treino.getGrupoMuscular());
            pst.setString(2, treino.getExercicios());
            pst.setInt(3, treino.getIdAluno());

            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar treino: " + e.getMessage());
            return false;
        }
    }

    public void consultarTreino(int idAluno) {
        String sql = "SELECT * FROM treino WHERE id_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idAluno);
            ResultSet rs = pst.executeQuery();
            boolean encontrou = false;

            while (rs.next()) {
                encontrou = true;
                System.out.println("Grupo Muscular: " + rs.getString("grupo_muscular"));
                System.out.println("Exercícios: " + rs.getString("exercicios"));
            }

            if (!encontrou) {
                System.out.println("Nenhum treino encontrado para este aluno.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao consultar treino: " + e.getMessage());
        }
    }

    public boolean deletarTreino(int idAluno) {
        String sql = "DELETE FROM treino WHERE id_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idAluno);
            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar treino: " + e.getMessage());
            return false;
        }
    }
}
