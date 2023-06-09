package ex05.ch04;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1",100, 5);

        attack(z1, d1);
    }
}