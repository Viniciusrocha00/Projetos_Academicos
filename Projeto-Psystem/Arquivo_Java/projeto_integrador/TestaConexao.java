package projeto_integrador;

import java.sql.Connection;

public class TestaConexao {
    public static void main(String[] args) {
        try {
            // Tenta estabelecer uma conexão com o banco de dados
            Connection conexao = ConexaoSql.getConnection();
            
            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                // Fecha a conexão
                conexao.close();
            } else {
                System.out.println("Falha ao estabelecer a conexão.");
            }
        } catch (Exception e) {
            // Exibe o erro, caso ocorra
            System.err.println("Erro ao testar a conexão: " + e.getMessage());
        }
    }
}
