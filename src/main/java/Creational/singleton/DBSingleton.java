package Creational.singleton;

public class DBSingleton {

  private static DBSingleton instance = null;

  private DBSingleton(){

  }

  public static DBSingleton getInstance(){
    //lazily loading the singleton
    if (instance == null){
      instance = new DBSingleton();
    }

    return instance;
  }

}
