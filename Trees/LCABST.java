public class LCABST
{
	public Node lcaBST(Node node,int n1,int n2)
	{
		if(node==null)
			return node;
		if(node.data<n1 && node.data<n2)
			return lca(node.right,n1,n2);

		if(node.data>n1 && node.data>n2)
			return lca(node.left,n1,n2);
		return node;
	}
	public Node lcaBT(Node node,int n1,int n2)
	{
		if(node==null)
			return null;
		if(node.data==n1 || node.data==n2)
			return node;
          Node leftLca=lcaBT(node.left,n1,n2);
          Node rightLca=lcaBT(node.right,n1,n2);

          if(leftLca!=null && rightLca!=null)
          	  return node;

         return leftLca!=null?leftLca:rightLca;
	}
}

