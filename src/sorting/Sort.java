package sorting;

public interface Sort {
	void ascending(int[] arr);
	void desending(int[] arr);
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
