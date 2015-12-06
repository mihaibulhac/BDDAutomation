package util;
import java.sql.*;

/**
 * Created by Mihai on 12/6/2015.
 */

public class DBConn {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://db4free.net:3306/test_automation";

    //  Database credentials
    static final String USER = ReadProperties.readProperty("DBConnection.properties","DBUser");
    static final String PASS =  ReadProperties.readProperty("DBConnection.properties","DBPassword");

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating database...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE Persons\n" +
                    "(\n" +
                    "PersonID int,\n" +
                    "LastName varchar(255),\n" +
                    "FirstName varchar(255),\n" +
                    "Address varchar(255),\n" +
                    "City varchar(255)\n" +
                    ");";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main


}
