public class MaxDepth
{
	public int maxDepth(Node node)
	{
		if (node==null)
			return 0;
		int ld=maxDepth(node.left);

		int rd=maxDepth(node.right);

		return Math.max(ld,rd)+1;
	}
}