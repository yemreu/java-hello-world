
package kkjjdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class KKJJDBCPreparedStatement {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musteribilgileri", "root", "1234");
        String sorgu = "insert into musteri(TCKimlikNo,Isim,SoyIsim,Adres,Telefon,Email) values(?,?,?,'samsun','00905995558899','emre@birmail.com')";
        PreparedStatement prepared = (PreparedStatement) con.prepareStatement(sorgu);
        prepared.setInt(1,123456782);
        prepared.setString(2, "emre");
        prepared.setString(3, "emre");
        int executeUpdate = prepared.executeUpdate();
        System.out.println(executeUpdate);
    }
}
