

//import com.sun.jdi.connect.spi.Connection;
//import com.sun.jdi.connect.spi.Connection; //burası hataya neden oluyordu
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;


public class dBVerbindung {
    static int port = 3306;
    static String local="localhost";
    static String db="bibliothek";
    static String nickname="root";
    static String password="";
    
        static Connection getConnection(){
            Connection cn=null;
            MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(nickname);
        dataSource.setPassword(password);
        dataSource.setPortNumber(port);
        dataSource.setServerName(local);
        dataSource.setDatabaseName(db);
        
            try {
                cn= (Connection) dataSource.getConnection();
                //System.out.println("Datenbanksverbindung ist erfolgreich!");
            } catch (Exception e) {
                System.out.println(e);
            }
            return cn;
        }
        
        public static void main(String[] args) {
            getConnection();
        }
}

