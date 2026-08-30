public class BankAccount {
  class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    Account(String accountNumber, String ownerName) {
      this.accountNumber = accountNumber;
      this.ownerName = ownerName;
      balance = 0;
    }

    Account(String accountNumber, String ownerName, double balance) {
      this.accountNumber = accountNumber;
      this.ownerName = ownerName;
      if (balance < 0) {
        System.err.println("Opening balance cannot be negative");
        this.balance = 0;
      } else {
        this.balance = balance;
      }
    }

    public boolean deposit(double amount) {
      if (amount <= 0) {
        return false;
      }
      balance += amount;
      return true;
    }

    public boolean withdraw(double amount) {
      if (amount <= 0 || amount > balance) {
        return false;
      }
      balance -= amount;
      return true;
    }

    public String getAccountNumber() {
      return accountNumber;
    }

    public String getOwnerName() {
      return ownerName;
    }

    public double getBalance() {
      return balance;
    }

    public String toString() {
      return "Account Number: " + accountNumber +
          ", Owner: " + ownerName +
          ", Balance: " + balance;
    }
  }

  public void BankAccount_main() {

    Account a1 = new Account("A101", "Aditya");
    Account a2 = new Account("A102", "Rahul", 1000);

    System.out.println("Account 1 -> " + a1);
    System.out.println("Account 2 -> " + a2);

    System.out.println("\nDepositing 500: " + a1.deposit(500) +
        "\nDepositing 0: " + a1.deposit(0) +
        "\nDepositing -100: " + a1.deposit(-100));

    System.out.println("\nWithdrawing 200: " + a1.withdraw(200) +
        "\nWithdrawing 1000: " + a1.withdraw(1000));

    System.out.println("\nFinal accounts:");
    System.out.println(a1 + "\n" + a2);

    a2.deposit(500);

    System.out.println("\nAfter depositing 500 into account 2:");
    System.out.println(a1 + "\n" + a2);
  }
}
