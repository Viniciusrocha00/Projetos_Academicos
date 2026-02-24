package projeto_integrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {

    public int cadastrarAlunoComRetornoID(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome_aluno, cpf_aluno, idade, altura, peso, imc, id_professor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getCpf().trim());
            pst.setInt(3, aluno.getIdade());
            pst.setInt(4, aluno.getAltura());
            pst.setFloat(5, aluno.getPeso());
            pst.setDouble(6, aluno.getImc());
            pst.setInt(7, aluno.getIdProfessor());

            int linhasAfetadas = pst.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
        return -1;
    }

    public Aluno buscarAlunoPorCPF(String cpf) {
        String sql = "SELECT * FROM aluno WHERE cpf_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, cpf.trim());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Aluno aluno = new Aluno(
                        rs.getString("nome_aluno"),
                        rs.getString("cpf_aluno"),
                        rs.getInt("idade"),
                        rs.getInt("altura"),
                        rs.getFloat("peso"),
                        rs.getDouble("imc"),
                        rs.getInt("id_professor")
                );
                aluno.setIdAluno(rs.getInt("id_aluno"));
                return aluno;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar aluno: " + e.getMessage());
        }
        return null;
    }

    public boolean atualizarAluno(Aluno aluno) {
        String sql = "UPDATE aluno SET nome_aluno = ?, idade = ?, altura = ?, peso = ?, imc = ? WHERE cpf_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, aluno.getNome());
            pst.setInt(2, aluno.getIdade());
            pst.setInt(3, aluno.getAltura());
            pst.setFloat(4, aluno.getPeso());
            pst.setDouble(5, aluno.getImc());
            pst.setString(6, aluno.getCpf().trim());

            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar aluno: " + e.getMessage());
            return false;
        }
    }

    public boolean deletarAluno(String cpf) {
        String sql = "DELETE FROM aluno WHERE cpf_aluno = ?";
        try (Connection conn = ConexaoSql.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, cpf.trim());
            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar aluno: " + e.getMessage());
            return false;
        }
    }
}
