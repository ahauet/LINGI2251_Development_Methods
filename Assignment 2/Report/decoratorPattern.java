public abstract class Purchase {
  private float amount;

  public float computePrice(){
    // default implementation
  }
}

public PurchaseDecorator extends Purchase {
  private Purchase purchase;

  // ... getter and setter for the purchase + special constructor

  public float computePrice(){
    return purchase.computePrice();
  }
}

public PurchaseDecoratorFees extends PurchaseDecorator {
  private float fee;

  // ... getter and setter for fee + special constructor

  public float computePrice(){
    float defaultPrice = super.computePrice();
    return defaultPrice + fee;
  }
}

//-----------------------------------------------------------------
// Usage example to add fee to credit purchase
//-----------------------------------------------------------------
CreditPurchase creditPurchase = new CreditPurchase();
CreditPurchase creditPurchaseWithFee = new PurchaseDecoratorFees(creditPurchase, 50.0);
float price = creditPurchaseWithFee.computePrice();
