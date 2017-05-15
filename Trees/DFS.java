public class DFS
{
	public void inorder(Node root)
	{
             if(root==null)
             	return ;
             inorder(root.left);
             System.out.println("in"+root.data);
             inorder(root.right);

	}


	public void postorder(Node root)
	{
		
             if(root==null)
             	return ;
             postorder(root.left);
             postorder(root.right);
             System.out.println(root.data);
             
	}

	public void preorder(Node root)
	{
			if(root==null)
             	return ;
             System.out.println("pre"+root.data);
             preorder(root.left);
             preorder(root.right);	
	}
}