package Creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {

  public static void main(String[] args) {
    DBSingleton instance = DBSingleton.getInstance();

    System.out.println(instance);

    DBSingleton anotherInstance = DBSingleton.getInstance();

    System.out.println(anotherInstance);
    //Observe that both of the objects printed are the same and hence only one of the object can be created

    Connection conn = instance.getConnection();

    Statement sta;
    try{
      sta = conn.createStatement();
      int count = sta.executeUpdate("CREATE TABLE Address (ID INT, Streetname VARCHAR(20),"
      + " City VARCHAR(20))");

      System.out.println("Table Created");
      sta.close();
    }catch (SQLException e){
      e.printStackTrace();
    }
  }

}
