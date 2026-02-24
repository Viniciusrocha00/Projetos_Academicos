package projeto_integrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projeto_integrador.Principal_Psystem;

public class ConexaoSql {
    public static Connection getConnection() {
        String endereco = "jdbc:mysql://127.0.0.1:3306/sql_psystem1";
        String user = "root";
        String password = "admin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(endereco, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}


