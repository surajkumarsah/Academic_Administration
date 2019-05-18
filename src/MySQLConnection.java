import java.sql.*;
import javax.swing.JOptionPane;

public class MySQLConnection {
    
    Connection conn = null;
    ResultSet rs;
    Statement stmt;
    
    public static Connection mySqlConnection(){
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","system","Password@123");
            //JOptionPane.showMessageDialog(null, conn);
            //Statement stmt = conn.createStatement();
            //ResultSet rs = stmt.executeQuery("Select * from login");
            //while()
            return conn;
       }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        }
    return null;
    }
}
