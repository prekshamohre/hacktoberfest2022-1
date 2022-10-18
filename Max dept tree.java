import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class Main
{
   public static int deptTree(Node root){
       
       if(root==null)
       return 0;
       
    int l=   deptTree(root.left);
     int r=  deptTree(root.right);
       
       return 1+ Math.max(l,r);
   }

	public static void main(String[] args) {
	     Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);

        
       
        
		System.out.println(deptTree(root));
		
	}
}
