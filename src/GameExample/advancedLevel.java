package GameExample;

public class advancedLevel extends playerLevel {

	
	
	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("높이 뜁니다.");
	}
	@Override
	public void turn() {
		System.out.println("trun할 줄 모르지롱");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("#####중급자 레벨입니다#####");
	}
}
