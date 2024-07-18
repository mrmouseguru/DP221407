package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/db221407";
        String password = "12345678";
        Connection connection = null;
        Statement statementRemote = null;
        ResultSet rsRemote = null;
        //1. KẾT NỐI ĐẾN MYSQL - db221407
        //nạp driver vào chương trình
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến db221407
        connection = DriverManager.getConnection(url, user, password);

        //System.out.println(connection.toString());

        //TRUY VẤN
        String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";

        //statement
        statementRemote = connection.createStatement();

        //thực thi câu query
        rsRemote = statementRemote.executeQuery(sql);

        //in danh sách nhân viên ra màn hình
        while (rsRemote.next()) {
            int empId = rsRemote.getInt(1);
            String empNo = rsRemote.getString(2);
            String empName = rsRemote.getString("Emp_Name");
            System.out.println("--------------------");
            System.out.println("EmpId:" + empId);
            System.out.println("EmpNo:" + empNo);
            System.out.println("EmpName:" + empName);
        }

        connection.close();

    }

}
