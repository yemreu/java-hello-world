
package kkjjdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KKJJDBCMetaData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musteribilgileri","root","1234");
        DatabaseMetaData metaTest = (DatabaseMetaData) con.getMetaData();
        String urunIsmi = metaTest.getDatabaseProductName();
        String urunVersiyon = metaTest.getDatabaseProductVersion();
        System.out.println("Veritabanı: "+urunIsmi+" Versiyon: "+urunVersiyon);
    }
}
