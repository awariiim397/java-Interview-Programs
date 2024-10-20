public class Linkedlist{
 Node head;

   static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 


public static Linkedlist insert(Linkedlist list,int data){
   Node new_node = new Node(data); 
		

		if (list.head == null) { 
			list.head = new_node; 
		} else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 
			last.next = new_node; 
		} 

		return list; 
}
public static void display(Linkedlist list) 
	{ 
		Node currNode = list.head; 
	
		System.out.print("LinkedList: "); 
	
		while (currNode != null) { 

			System.out.print(currNode.data + " "); 
	
			currNode = currNode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Linkedlist list = new Linkedlist(); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		 

		display(list); 
	} 
}




 
     
