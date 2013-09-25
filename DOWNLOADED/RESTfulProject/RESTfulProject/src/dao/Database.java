package dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//http://localhost:8084/RESTfulProject/REST/WebService/GetFeeds
public class Database {
	
	public Connection Get_Connection() throws Exception
	{
            try{
                String connectionURL = "jdbc:postgresql://localhost:5469/Insigma";
                Connection connection = null;
                Class.forName("org.postgresql.Driver").newInstance();
                connection = DriverManager.getConnection(connectionURL, "postgres", "Wojna2ds");
                return connection;
            }
            catch (SQLException e){
                throw e;	
            }
            catch (Exception e){
                throw e;	
            }
	}

}
