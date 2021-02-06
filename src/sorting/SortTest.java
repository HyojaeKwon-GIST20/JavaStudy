package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���");
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		//���� ��İ� ������� Sort�� ����� �޼��� ȣ��
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.desending(arr);
		sort.description();	
		
}
}
