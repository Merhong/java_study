package ex05.composit;

/**
 * 컴포지션(Composition)
 * 다중상속이 불가능한 자바에서 사용.
 * "has a(가지고 있는)" 관계일때 사용.
 * 생성자를 private로 캡슐화
 */
public class BurgerSet {
    private final Burger burger;
    private final Coke coke;
    private final Potato potato;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }
}
