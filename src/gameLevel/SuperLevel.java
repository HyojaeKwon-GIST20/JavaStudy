package gameLevel;

public class SuperLevel extends playerLevel {
	@Override
	public void run() {
		System.out.println("��û ������ �޸��ϴ�.");
	}
	
	@Override
	public void jump() {
		System.out.println("��û ���� Jump �մϴ�");
	}
	
	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("@@@@@����� �����Դϴ�.@@@@@");
		System.out.println();
	}
}
