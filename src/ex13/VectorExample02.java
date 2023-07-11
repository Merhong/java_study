package ex13;

import java.util.Vector;

class Monster {
	
	String name;
	double hp;
	
	public Monster(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return "{" + name + "," + hp + "}";
	}
}

public class VectorExample02 {
	
	public static void main(String[] args) {
		Vector<Monster> list = new Vector<>();          // 몬스터 객체를 저장하는 벡터 생성
		
		list.add(new Monster("몬스터1", 100));  // 몬스터 객체를 벡터에 추가
		list.add(new Monster("몬스터2", 2000));
		list.add(new Monster("몬스터3", 50000));
		
		System.out.println("벡터의 크기 : " + list.size());
		System.out.println(list);
		
	}
}
