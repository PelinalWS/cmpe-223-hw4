
public class Customer {
	private int id, regTime, arrivTime, serviceTime;
	private static final int founding = 1968;
	private int prio; // priority is defined considering the period of time that a customer has been
						// with the company

	private static Heap<Customer> heap = new Heap<Customer>();

	public Customer(int id, int regTime, int arrivTime, int serviceTime) {
		this.id = id;
		this.regTime = regTime;
		this.arrivTime = arrivTime;
		this.serviceTime = serviceTime;
		this.heap.add(this.id, this);
	}

	private void calcPrio() {
		prio = 2022 - regTime;
	}

}
