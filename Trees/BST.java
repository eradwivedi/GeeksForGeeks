class Node
{
	public int data;
	public Node left;
	public Node right;
	public Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BST
{
	public Node root;
	public void insert(int data)
	{    
		if(root==null)
		{
			root=new Node(data);
		    return;
		}
		
		insertHelper(root,data);
	}
	public Node insertHelper(Node node,int data)
	{  
		if(node==null)
			return new Node(data);
		if(data<root.data)
		{
			node.left=insertHelper(node.left,data);
		}
		else if(data>node.data)
		{
		node.right=insertHelper(node.right,data);	
		}
		return node;
	}

	public Node getRoot()
	{
		return root;
	}
}