class Node
{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class LinkedList
{
	private Node head;
	public void insert(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{ 
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void display(Node root)
	{
			Node temp=root;
			while(temp!=null)
			{	
				System.out.println(temp.data+"->");
				temp=temp.next;
			}
		
	}
	public Node getList()
	  {
	  	return head;
	  }
}