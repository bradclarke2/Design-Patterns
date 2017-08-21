package Creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.derby.jdbc.EmbeddedDriver;

public class DBSingleton {

  private static DBSingleton instance = null;

  private Connection conn = null;

  private DBSingleton() {
    try{
      DriverManager.registerDriver(new EmbeddedDriver());
    }catch (SQLException e){
      e.printStackTrace();
    }
  }

  public static DBSingleton getInstance() {
    //lazily loading the singleton
    if (instance == null) {
      //adding threadsafe approach
      synchronized (DBSingleton.class) {
        if (instance == null) {
          instance = new DBSingleton();
        }
      }
    }
    return instance;
  }

  public Connection getConnection(){
    if (conn ==null){
      synchronized (DBSingleton.class){
        if (conn ==null){
          try{
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

            conn = DriverManager.getConnection(dbUrl);
          }catch (SQLException e){
            e.printStackTrace();
          }
        }
      }
    }
    return conn;
  }
}
