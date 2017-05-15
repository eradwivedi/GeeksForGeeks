public class Main
{
	public static void main(String args[])
	{
        BST tree=new BST();
        tree.insert(5);
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(7);
        tree.insert(8);
     	DFS d=new DFS();
        d.inorder(tree.getRoot());
        d.preorder(tree.getRoot());
        MaxDepth m=new MaxDepth();
        System.out.println(m.maxDepth(tree.getRoot()));
	}
}
