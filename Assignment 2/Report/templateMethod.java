public abstract class Payment {
  private boolean paid = false;
  private float price;

  public abstract PrintableReceipt getReceipt();
}

public class CheckPayment extends Payment {
  public abstract PrintableReceipt getReceipt(){
    // concrete implementation with custom description
  }
}

public class CreditPayment extends Payment {
  public abstract PrintableReceipt getReceipt(){
    // concrete implementation with custom description
  }
}
