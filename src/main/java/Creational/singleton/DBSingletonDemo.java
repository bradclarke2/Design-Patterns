package Creational.singleton;

public class DBSingletonDemo {

  public static void main(String[] args) {
    DBSingleton instance = DBSingleton.getInstance();

    System.out.println(instance);

    DBSingleton anotherInstance = DBSingleton.getInstance();

    System.out.println(anotherInstance);

    //Observe that both of the objects printed are the same and hence only one of the object can be created
  }

}
