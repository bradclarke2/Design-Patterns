package Creational.AbstractFactory;

public class AmexPlatinumValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard){
    return false;
  }

}
