package sunday;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	BinNode<Integer> leftChild = new BinNode<>(-1);
        BinNode<Integer> rightChild = new BinNode<>(99);
        BinNode<Integer> root = new BinNode<>(leftChild, -1, rightChild);
        System.out.println(shahar1(root));
    }
    public static boolean shahar1(BinNode<Integer> root) {
    	if(root == null) {
    		return true;
    	}
    	if (root.getLeft() == null && root.getRight() == null)
    		return true;
    	boolean left = root.hasLeft() && root.getValue() < root.getLeft().getValue() && shahar1(root.getLeft());
    	boolean right = root.hasRight() && root.getValue() < root.getRight().getValue() && shahar1(root.getRight());
    	return left || right;
    }
    public static boolean isAscendingQueue(Queue<Integer> queue) {
		Queue<Integer> save = new Queue<>();
		int previousSave = queue.remove();
		while (queue.head()!=null) {
			int value = queue.remove();
			save.insert(value);
			if (previousSave >= value) {
				return false;
			}
		previousSave= value;
		}
		return true;
	}
    public static int ex2(Queue<Integer> queue, int num) {
    	int count = 0;
    	queue.insert(null);
    	while(queue.head()!=null) {
			int valuenow = queue.remove();
			if(valuenow == num) {
				count++;
			}
			queue.insert(valuenow);
    }
    	return count;
  }
}
