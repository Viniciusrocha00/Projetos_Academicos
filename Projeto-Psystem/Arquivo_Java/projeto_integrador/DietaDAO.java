package projeto_integrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DietaDAO {

    public boolean cadastrarDieta(Dieta dieta) {
        String sql = "INSERT INTO dieta (tipo_dieta, comida, id_aluno) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, dieta.getTipoDieta());
            pst.setString(2, dieta.getComida());
            pst.setInt(3, dieta.getIdAluno());

            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar dieta: " + e.getMessage());
            return false;
        }
    }

    public void consultarDieta(int idAluno) {
        String sql = "SELECT * FROM dieta WHERE id_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idAluno);
            ResultSet rs = pst.executeQuery();
            boolean encontrou = false;

            while (rs.next()) {
                encontrou = true;
                System.out.println("Tipo de Dieta: " + rs.getString("tipo_dieta"));
                System.out.println("Comida: " + rs.getString("comida"));
            }

            if (!encontrou) {
                System.out.println("Nenhuma dieta encontrada para este aluno.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao consultar dieta: " + e.getMessage());
        }
    }

    public boolean deletarDieta(int idAluno) {
        String sql = "DELETE FROM dieta WHERE id_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, idAluno);
            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar dieta: " + e.getMessage());
            return false;
        }
    }
}
