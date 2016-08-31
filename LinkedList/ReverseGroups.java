
public class ReverseGroups
{
	public Node reverseGroups(Node head,int k)
	{     Node prev=null;
		Node curr=head;
		int c=0;
		while(c<k && curr!=null)
		{   
			System.out.println("curr data "+curr.data);
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			System.out.println("counter "+c);

			c++;
		}
		if(curr!=null)
		{   System.out.println("calling reverseGroups again");
			
			head.next=reverseGroups(curr,k);
		}
		return prev;
	}

	public Node reverse(Node head)
	{
		/*if(head.next==null)
			return head;*/
		Node prev=null;
		Node curr=head;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
}