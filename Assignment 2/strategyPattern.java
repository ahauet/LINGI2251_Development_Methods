public interface Reporting {
  public void generatePrintout();
}

public class ReportingAccount implements Reporting {
  public void generatePrintout(){
    //concrete implementation for an Account
  }
}

public class ReportingPayment implements Reporting {
  public void generatePrintout(){
    //concrete implementation for a Payment
  }
}

public class BillingStorageController{
  // ...
  private Reporting strategyForReporting;
  // ...
  public void generateReport(){
    strategyForReporting.generatePrintout();
  }
}

//-----------------------------------------------------------------
// Usage example of this interface
//-----------------------------------------------------------------
Reporting strategyForReporting = new ReportingAccount(); // or ReportingPayment
BillingStorageController b = new BillingStorageController();
b.setStrategyForReporting(strategyForReporting);
b.generateReport(); // use the correct strategy
