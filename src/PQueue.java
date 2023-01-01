public class PQueue<T extends Comparable<T>> {
	private T[] heap;
	private static int shiftIndex = -1, size = 0;

	@SuppressWarnings("unchecked")
	PQueue() {
		this.heap = (T[]) new Comparable[size];
	}

	private static int parent(int pos) {
		return (pos - 1) / 2;
	}

	private static int leftChild(int pos) {
		return (2 * pos) + 1;
	}

	private static int rightChild(int pos) {
		return (2 * pos) + 2;
	}

	public void add(T key) {
		shiftIndex++;
		heap[shiftIndex] = key;
		shiftUp(shiftIndex);
	}

	public T dequeue() {
		T result = heap[0];
		heap[0] = heap[shiftIndex];
		shiftIndex--;
		shiftDown(0);
		return result;
	}

	private void shiftUp(int i) {
		while (i > 0 && heap[parent(i)].compareTo(heap[i]) < 0) {
			swap(parent(i), i);
			i = parent(i);
		}
	}

	private void shiftDown(int i) {
		int maxIndex = i;
		int left = leftChild(i);

		if (left <= shiftIndex && heap[left].compareTo(heap[maxIndex]) > 0) {
			maxIndex = left;
		}
		int right = rightChild(i);

		if (right <= shiftIndex && heap[right].compareTo(heap[maxIndex]) > 0) {
			maxIndex = right;
		}

		if (i != maxIndex) {
			swap(i, maxIndex);
			shiftDown(maxIndex);
		}
	}

	private void swap(int i, int j) {
		T temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public static void setSize(int a) {
		size = a;
	}

	public static int getSize() {
		return size;
	}
	
	public int getShiftIndex() {
		return shiftIndex;
	}

	public void equalize(PQueue<T> q) {
		for (int i = 0; i < size; i++) {
			this.heap[i] = q.heap[i];
		}
	}
}
