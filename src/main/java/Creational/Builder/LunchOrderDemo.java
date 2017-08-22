package Creational.Builder;

import Creational.Builder.LunchOrder.Builder;

public class LunchOrderDemo {

  public static void main(String[] args) {
    LunchOrder.Builder builder = new Builder();

    builder.bread("Granary").condiments("mayo").meat("Chicken");

    LunchOrder lunchOrder = builder.build();

    System.out.println(lunchOrder.getBread());
    System.out.println(lunchOrder.getCondiments());
    System.out.println(lunchOrder.getDressing());
    System.out.println(lunchOrder.getMeat());
  }

}
