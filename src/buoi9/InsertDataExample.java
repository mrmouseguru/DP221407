package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. kết nối CSDL
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/db221407";
        String password = "12345678";
        Connection connection = null;
        Statement statementRemote = null;
        //1. KẾT NỐI ĐẾN MYSQL - db221407
        //nạp driver vào chương trình
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến db221407
        connection = DriverManager.getConnection(url, user, password);


        //2. truy vấn
        String sql = "Insert into Salary_Grade (Grade, High_Salary, Low_Salary)"  
                    + " values (2, 20000, 10000)";
        statementRemote = connection.createStatement();
        //thực thi
        int rowCount = statementRemote.executeUpdate(sql);

        System.out.println("Row count affected is: " + rowCount);

        connection.close();
    }

}
