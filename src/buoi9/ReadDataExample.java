package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/db221407";
        String password = "12345678";
        Connection connection = null;
        //1. KẾT NỐI ĐẾN MYSQL - db221407
        //nạp driver vào chương trình
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến db221407
        connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection.toString());

        //TRUY VẤN
        String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
    }

}
