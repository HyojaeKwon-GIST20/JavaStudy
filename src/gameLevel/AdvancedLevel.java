package gameLevel;

public class AdvancedLevel extends playerLevel {
	
	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("높이 Jump 합니다");
	}
	
	@Override
	public void turn() {
		System.out.println("turn할 줄 모르지롱");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("@@@@@중급자 레벨입니다.@@@@@");
		System.out.println();
	}
}
