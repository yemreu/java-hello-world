
package kkjjdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KKJJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver bulunamadı..");
            return;
        }
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","1234");
            System.out.println("Veritabanı bağlantısı kuruldu.");
        } catch (SQLException e) {
            System.err.println("Veritabanı bağlantısı kurulamadı.");
        }
        finally{
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }
    
}
