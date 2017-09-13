package Creational.AbstractFactory;

public class VisaFactory extends CreditCardFactory {

  public CreditCard getCreditCard(CardType cardType){

    switch (cardType){
      case GOLD:
        return VisaGoldCreditCard();

      case PLATINUM:
        return VisaBlackCreditCard();
    }
    return null;

  }

  @Override
  public Validator getValidator(CardType cardType){
    return new VisaValidator();
  }
}
