
public class Heap<T> {
	
		private static int[] heap;

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

	public void add(int key, T data) {

	}

	public void reheap(int n, int i) {
		int root = i;
		
	}
	
	private static void shiftUp(int i){
		while (i > 0 && heap[parent(i)] < H[i]){
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
		int temp= H[i];
		H[i] = H[j];
		H[j] = temp;
	}
}
