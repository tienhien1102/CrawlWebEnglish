import java.sql.*;

/**
 * Created by tienhien on 26/03/2016.
 */
public class MysqlConnection {
    String dbUrl = "jdbc:mysql://localhost/mysite";
    String dbClass = "com.mysql.jdbc.Driver";
    String query = "Select distinct(table_name) from INFORMATION_SCHEMA.TABLES";
    String username = "root";
    String password = "asilla";

    public void getConnection() {
        try {

            Class.forName(dbClass);
            Connection connection = DriverManager.getConnection(dbUrl,
                    username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String tableName = resultSet.getString(1);
                System.out.println("Table name : " + tableName);
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
