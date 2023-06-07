package ex05.ch02;


public class App {
    public static void main(String[] args) {
        ProtossUnit zealot = new Zealot();
        ProtossUnit dragoon = new Dragoon();
        ProtossUnit darktempler = new DarkTempler();
        
        zealot.Attack(zealot, dragoon);
        dragoon.Attack(dragoon, darktempler);
        darktempler.Attack(darktempler, zealot);

    }
}
