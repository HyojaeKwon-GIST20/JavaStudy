package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요");
		System.out.println("B :  Bubble Sort");
		System.out.println("H :  Heap Sort");
		System.out.println("Q :  Quick Sort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch =='b' || ch == 'B') {
			sort = new BubbleSort();
		}
		else if(ch == 'h' || ch == 'H') {
			sort = new HeapSort();
		}
		else if(ch == 'q' || ch == 'Q') {
			sort = new QuickSort();
		}
		else{
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		//정렬 방식과 상관없이 Sort에 선언된 메서드 호출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.desending(arr);
		sort.description();	
		
}
}
