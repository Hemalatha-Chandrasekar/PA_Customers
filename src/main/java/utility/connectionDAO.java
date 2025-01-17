package utility;

import java.sql.*;

public class connectionDAO {
    public static Connection connection = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    public static Connection getConnection() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/customers";
        final String username = "root";
        final String password = "welcome#1";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully");

        } catch (
                SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return connection;
    }

    public void disconnect() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
