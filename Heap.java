
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
	
	private static void shiftDown(int i){
 		 int maxIndex = i;
 		 int left = leftChild(i);
 
  		if (l <= size && H[left] > H[maxIndex]){
   			maxIndex = l;
  		}
 		  int right = rightChild(i);
 
  		if (r <= size && H[right] > H[maxIndex]){
			maxIndex = r;
		}
 
		  if (i != maxIndex){
			  swap(i, maxIndex);
			  shiftDown(maxIndex);
		  }
	}
}
