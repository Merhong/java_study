package ex05.ch02;

public class Zealot extends ProtossUnit {

  String name;
  int hp;
  int attack;

  // 생성자
  public Zealot(String name, int hp, int attack) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
  }

  @Override
  public int getHp() {
    return hp;
  }

  @Override
  public void setHp(int hp) {
    this.hp = hp;
  }

  @Override
  public int getAttack() {
    return attack;
  }

  @Override
  public String getName() {
    return name;
  }
}