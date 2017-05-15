public class Main
{
	public static void main(String args[])
	{
		Main m=new Main();
     /*   LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
     	ReverseGroups r=new ReverseGroups();
        Node reversed=r.reverseGroups(list.getList(),2);
        list.display(reversed);*/
	System.out.println(m.f(435));
	}
	public int f(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n>>=1;
			System.out.println(n);
		}
		return c;
	}
}
