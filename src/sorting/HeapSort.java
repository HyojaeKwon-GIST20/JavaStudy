package sorting;

public class HeapSort implements Sort{
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void desending(int[] arr) {
		System.out.println("HeapSort desending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort�Դϴ�.");
		
	}
}
