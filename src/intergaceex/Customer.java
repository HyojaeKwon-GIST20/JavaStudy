package intergaceex;

public class Customer implements Buy, sell{
	
	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}
	
	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}
}
