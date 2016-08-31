public class D&RCycle
{
	public boolean d&RCycle(Node head)
	{
		Node slow=head;
		Node fast=head.next;
		Node temp=head;
		boolean cycleExists=false;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			if(slow==fast)
				cycleExists=true;

			slow=slow.next;
			fast=fast.next.next;
		}

		if(cycleExists)
		{
			slow=head;
			while(slow!=fast)
			{
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
			return true;
		}
		return false;
	}
}