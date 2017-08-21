package Creational.singleton;

public class DBSingleton {

  private static DBSingleton instance = new DBSingleton();

  private DBSingleton(){

  }

  public static DBSingleton getInstance(){
    return instance;
  }

}
