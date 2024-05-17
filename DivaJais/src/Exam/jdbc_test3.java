package Exam;
import java.sql.*;
public class jdbc_test3 {
    static final String DB_URL = "jdbc:mysql://localhost/java_db";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "CREATE TABLE REGISTRATION(id INTEGER not NULL, first VARCHAR(255), last VARCHAR(255), age INTEGER, PRIMARY KEY(id))";


}
