package Exam;
import java.sql.*;
public class jdbc {
private static final String DB_URL="jdbc:mysql://localhost/java_db";
private static final String USER="root";
private static final String PASS = "";
private static final String QUERY = "Select id, first, last, age FROM Employees";
public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(QUERY))
    {
        while (rs.next()) {
            int sum = 0;
            int id = rs.getInt("id");
            int age = rs.getInt("age");
            String first_name = rs.getString("first");
            String last_name = rs.getString("last");

            System.out.printf("id: %d, age: %d, first: %s, last: %n%s", id, age, first_name, last_name);
        }
    }
    catch (SQLException e){
        e.printStackTrace();
    }
}
}
