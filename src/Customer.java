@SuppressWarnings("unused")
public class Customer implements Comparable<Customer> {
	private int id, regTime, arrivTime, serviceTime, waitTime = 0;
	private static int totalWait = 0;
	private int prio = 2022 - regTime;; // priority is defined considering the period of time that a customer has been
	// with the company
	private static PQueue<Customer> queue = new PQueue<Customer>();

	public Customer(int id, int regTime, int arrivTime, int serviceTime) {
		this.id = id;
		this.regTime = regTime;
		this.arrivTime = arrivTime;
		this.serviceTime = serviceTime;
		queue.add(this);
	}

	private static PQueue<Customer> createIdenticalHeap(PQueue<Customer> queue) {
		PQueue<Customer> queueI = new PQueue<Customer>();
		queueI.equalize(queue);
		return queueI;
	}

	public static void courrierCount(int maxTime) {
		int avgTime = 99999;
		for (int i = 0; avgTime > maxTime; i++) {
			Courrier[] courriers = new Courrier[i+1];
			PQueue<Customer> queueI = createIdenticalHeap(queue);
			while (queueI.getShiftIndex() >= 0) {
				for(int j = 0; j<=i;j++) {
				if(courriers[j].available);
			}}
		}
	}

	public int compareTo(Customer c) {
		if (this.prio > c.prio)
			return 1;
		else if (this.prio < c.prio)
			return -1;
		else {
			if (this.waitTime - this.getArrivTime() > c.waitTime - c.getArrivTime())
				return 1;
			else
				return -1;
		}
	}

	protected int getArrivTime() {
		return arrivTime;
	}

	protected int getId() {
		return id;
	}

	protected int getServiceTime() {
		return serviceTime;
	}
}

class Courrier {
	static int count = 0;
	int id = 0;
	int time = 0;
	boolean available = true;

	Courrier() {
		this.id = count;
		count++;
	}

	void serveCustomer(Customer c) {
		if (time < c.getArrivTime())
			time = c.getArrivTime();
		System.out.println("Courrier " + id + " takes customer " + c.getId() + " at minute " + time + " (wait: "
				+ (time - c.getArrivTime()) + " mins)");
		time += c.getServiceTime();
	}

	void changeAvailability() {
		if (available)
			available = false;
		else
			available = true;
	}
}
