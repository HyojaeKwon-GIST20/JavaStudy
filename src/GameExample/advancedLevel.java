package GameExample;

public class advancedLevel extends playerLevel {

	
	
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("���� �ݴϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("trun�� �� ������");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("#####�߱��� �����Դϴ�#####");
	}
}
