package GameExample;

public class superLevel extends playerLevel{
	
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("�������� �ݴϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("������ ���ϴ�");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("#####����� �����Դϴ�#####");
	}
}
