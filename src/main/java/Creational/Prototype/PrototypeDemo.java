package Creational.Prototype;

public class PrototypeDemo {

  public static void main(String[] args) {
    Registry registry = new Registry();
    Movie movie = (Movie)registry.createItem("Movie");
    movie.setRuntime("27hours");

    System.out.println(movie);
    System.out.println(movie.getRuntime());

    Movie anotherMovie = (Movie)registry.createItem("Movie");
    anotherMovie.setRuntime("only 2mins long");

    System.out.println(anotherMovie);
    System.out.println(anotherMovie.getRuntime());
  }

}
