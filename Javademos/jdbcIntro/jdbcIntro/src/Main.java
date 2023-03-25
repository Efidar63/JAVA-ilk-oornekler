import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String username="root";
    static String password="Efidar.49";
    static String dbUrl="jdbc:mysql://localhost:3306/";
    public static void main(String[] args) throws SQLException {

        Connection connection=null;
        try {
            connection= DriverManager.getConnection(dbUrl,username,password);
            System.out.println("bağlantı var");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            connection.close();
        }
    }
}