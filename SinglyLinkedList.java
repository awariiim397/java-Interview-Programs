class SinglyLinkedList
{
Node head;
 class Node
{
  int data;
  Node next;
}


public   SinglyLinkedList(int d)
	{
	  int data = d;
	  Node next = null;
	 }
void insert(int new_data){
 Node n=new Node();

n.data=new_data;
n.next=head;
head=n;
System.out.println("DAta inserted successfully  "+ new_data);

}
void deleteFirstNode(){
if (head==null)
return;
Node temp=head;
head=head.next;
System.out.println("First node deleted successfully");

}
void printList()
{
  Node node=head;
while(node != null){
System.out.print(node.data+" ");
node=node.next;
}
System.out.println();
}
public static void main (String args[]){
SinglyLinkedList sl=new SinglyLinkedList(3);
 sl.insert(2);
sl.insert(3);
sl.insert(4);
sl.insert(5);
sl.insert(6);
sl.insert(7);

System.out.println("Before deleting List is ");
sl.printList();
sl.deleteFirstNode();
System.out.println("After deleting List is"); 
sl.printList();

}
}
