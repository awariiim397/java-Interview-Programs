

import java.util.Scanner;

 class CircularQueue {

	int rear, front;
	static int size;
	int arr[] = new int[size];
	int element;

	CircularQueue() {
		rear = -1;
		front = -1;
	}

	boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public void enqueue(Scanner sc) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			}System.out.println("enter the value what tou want add");
			element=sc.nextInt();
			//rear++;
                        rear=(rear+1)%size;
			arr[rear] = element;
			System.out.println("inserting:" + element);
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is  already Empty");
		} else {
			element = arr[front];
			
			System.out.println("delete" + element);
                      front=(front+1)%size;
		}
		return element;
	}

	public void peek() {
		if (isFull()) {
			System.out.println(arr[front]);
		} else if (isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			System.out.println(arr[front]);
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("Queue is  already empty");
		} else {
			for (int i = front; i <= rear; i++)

				System.out.print(arr[i] + " , ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Queue:");
		size = sc.nextInt();
		CircularQueue q = new CircularQueue();

		int choice = 0;
		while (choice != 5) {
			System.out.println("\nChoice the condition from below to perform operations on queue:");

			System.out.println("...........................................");
			System.out.println("Enter your Choice:");

			System.err.println("1.Enqueue(Add Element)\n 2.Dequeue(Delete Element)\n 3.Peek(Check which element is a first) \n4.Display(Queue)\n5.Exit ");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				q.enqueue(sc);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				q.display();
				break;
			case 5: {

				System.out.println("Exiting..........");
				break;
			}
			default: {
				System.out.println("Please enter a valid choice");
			}

			}
		}
	}

}
