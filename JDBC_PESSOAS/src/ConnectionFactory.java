import java.sql.*;

public class ConnectionFactory{
    private static final String HOST = "Localhost";
    private static final String PORT = "5432";
    private static final String DB = "20242_fatec_ipi_poo_pessoas_v2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "@senha1208";
    public static Connection conectar(){
        try {
            var s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                HOST, PORT, DB
            );
            Connection c = DriverManager.getConnection(
                s, USER, PASSWORD
            ); 
            return c;       
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }   
    }
}