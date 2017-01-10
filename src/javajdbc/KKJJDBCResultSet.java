
package kkjjdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KKJJDBCResultSet {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musteribilgileri","root","1234");
        Statement statement = (Statement) con.createStatement();
        ResultSet rs = statement.executeQuery("Select * FROM Musteri");
        while(rs.next()){
            System.out.println(rs.getString("Isim")+": "+rs.getString("SoyIsim")+": "+rs.getTimestamp("KayitTarihi"));
        }
    }
}
