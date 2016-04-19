public interface Account {
  public float getRemainingBalance();
}

public class CompanyAccount implements Account {
  private List<Account> accounts;

  public void addAccount(Account account){
    accounts.add(account);
  }

  public void removeAccount(Account account){
    accounts.remove(account);
  }

  public float getRemainingBalance(){
    float sum = 0.0f;
    for(Account account : accounts){
      sum += account.getRemainingBalance();
    }
    return sum;
  }
}

public class SingleAccount implements Account {
  private IBAN accountNumber;
  // ... getter and setter

  public float getRemainingBalance(){
    // return the remaining balance
  }
}
