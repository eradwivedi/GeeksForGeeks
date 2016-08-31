public class Main
{
	public static void main(String args[])
	{
        LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
     	ReverseGroups r=new ReverseGroups();
        Node reversed=r.reverseGroups(list.getList(),2);
        list.display(reversed);
	}
}
