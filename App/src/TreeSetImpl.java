import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(2);
		tree.add(7);
		tree.add(8);
		tree.add(10);
		tree.add(20);
		
		System.out.println(tree);
		
		Iterator<Integer> iterator = tree.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(tree.pollFirst());
		System.out.println(tree.pollLast());
		System.out.println(tree.isEmpty());
	}
}
