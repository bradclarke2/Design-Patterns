package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String, Item> items = new HashMap<String, Item>();

  public Registry() {
    loadItems();
  }

  public Item createItem(String type){
    Item item = null;

    try {
      item = (Item)(items.get(type)).clone(); //casts item to an Item
    }catch (CloneNotSupportedException e){
      e.printStackTrace();
    }
    return item;
  }

  private void loadItems() {
    Movie movie = new Movie();
    movie.setRuntime("2hr 25min");
    items.put("Movie", movie);

    Book book = new Book();
    book.setNumberOfPages(327);
    items.put("Book", book);
  }
}
