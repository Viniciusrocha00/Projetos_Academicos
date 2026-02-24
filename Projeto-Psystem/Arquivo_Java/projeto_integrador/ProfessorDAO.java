package projeto_integrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {

    public boolean cadastrarProfessor(Professor professor) {
        String sql = "INSERT INTO professor (nome_professor, cpf_professor) VALUES (?, ?)";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, professor.getNome());
            pst.setString(2, professor.getCpf().trim());
            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar professor: " + e.getMessage());
            return false;
        }
    }

    public Professor buscarProfessorPorCPF(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.err.println("Erro: CPF nulo ou vazio.");
            return null;
        }

        String sql = "SELECT * FROM professor WHERE cpf_professor = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, cpf.trim());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return new Professor(
                        rs.getInt("id_professor"),
                        rs.getString("nome_professor"),
                        rs.getString("cpf_professor")
                );
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar professor: " + e.getMessage());
        }
        return null;
    }

    public boolean deletarProfessor(String cpf) {
        String sql = "DELETE FROM professor WHERE cpf_professor = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, cpf.trim());
            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar professor: " + e.getMessage());
            return false;
        }
    }
}
