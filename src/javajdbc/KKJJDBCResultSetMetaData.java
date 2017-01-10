
package kkjjdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KKJJDBCResultSetMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musteribilgileri","root","1234");
        Statement statement = (Statement) con.createStatement();
        ResultSet rs = statement.executeQuery("Select * FROM Musteri");
        ResultSetMetaData metaTest = (ResultSetMetaData) rs.getMetaData();
        System.out.println("Sütun sayısı: "+metaTest.getColumnCount()+"\n");
        for (int i = 1; i < metaTest.getColumnCount()+1; i++) {
            System.out.println(metaTest.getColumnName(i)+": "+metaTest.getColumnTypeName(i)+": "+metaTest.getColumnCharacterSet(i));
        }
    }
}
