
public class Heap<T> {
	
	private static int[] heap;
	private static int shiftIndex = -1;

	private int parent(int pos) {
		return (pos - 1) / 2;
	}

	private int leftChild(int pos) {
		return (2 * pos) + 1;
	}

	private int rightChild(int pos) {
		return (2 * pos) + 2;
	}

	public static void createHeap(int size) {
		heap = new int[size];
	}

	public void add(int key) {
  		shiftIndex++;
		heap[shiftIndex] = p;
		shiftUp(size);
}
	}

	public static void deleteMax(int i){
		H[i] = getMax() + 1;
		shiftUp(i);
		extractMax();
}
	
	private static void shiftUp(int i){
		while (i > 0 && heap[parent(i)] < heap[i]){
			swap(parent(i), i);
			i = parent(i);
		}
	}
	
	private static void shiftDown(int i){
 		 int maxIndex = i;
 		 int left = leftChild(i);
 
  		if (l <= size && heap[left] > heap[maxIndex]){
   			maxIndex = l;
  		}
 		  int right = rightChild(i);
 
  		if (r <= size && heap[right] > heap[maxIndex]){
			maxIndex = r;
		}
 
		  if (i != maxIndex){
			  swap(i, maxIndex);
			  shiftDown(maxIndex);
		  }
	}
	
	private static void swap(int i, int j){
		int temp= heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
}
