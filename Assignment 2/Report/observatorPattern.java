public interface Observer {
  public void notify(Observable obs);
}

public class FuelStockController implements Observer {
  // ...
  public void notify(Observable obs){
    GasPumpController ctrl = (GasPumpController) obs;
    //update the stock
  }
}

public class PaymentController implements Observer {
  // ...
  public void notify(Observable obs){
    GasPumpController ctrl = (GasPumpController) obs;
    //update the stock
  }
}

public abstract class Observable {
  private List<Observer> observers;

  public void register(Observer obs){
    observers.add(obs);
  }

  public void unregister(Observer obs){
    observers.remove(obs);
  }

  public void notifyObservers(){
    for(Observer obs : observers){
      obs.notify(this);
    }
  }
}

public class GasPumpController extends Observable {
  // ...
  // This class is unchanged, except that it must call
  // the notifyObservers method when its state changes
  // and that it extends Observable
}
