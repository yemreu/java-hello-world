
package kkjjdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class KKJJDBCUpdateStatement {
    
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musteribilgileri", "root","1234");
        String sorgu = "insert into musteri(TCKimlikNo,MusteriNo,Isim,SoyIsim,Adres,Telefon,Email) values(123456789,4,'Emre','emre','samsun','00905995558899','emre@birmail.com')";
        Statement statement = (Statement) con.createStatement();
        int executeUpdate = statement.executeUpdate(sorgu);
    }
}
