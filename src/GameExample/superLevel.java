package GameExample;

public class superLevel extends playerLevel{
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("ㄹㅇ높게 뜁니다.");
	}
	@Override
	public void turn() {
		System.out.println("빠르게 돕니다");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("#####고급자 레벨입니다#####");
	}
}
