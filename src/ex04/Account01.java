package ex04;

// Meth03에 Account 클래스 존재
public class Account01 {

  private int regNumber;
  private String name;
  private int balance;

  public static void main(String[] args) {
    Account01 obj = new Account01();
    obj.setName("Tom");
    obj.setBalance(1000000);
    System.out.println("이름은 " + obj.getName() + " 통장잔고는 " + obj.getBalance() + "입니다.");
  }

  public int getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(int regNumber) {
    this.regNumber = regNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
