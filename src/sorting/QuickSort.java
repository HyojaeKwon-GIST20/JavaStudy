package sorting;

public class QuickSort implements Sort {

	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort�Դϴ�.");
		
	}

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");		
	}

	@Override
	public void desending(int[] arr) {
		System.out.println("QuickSort desending");
		
	}

}
