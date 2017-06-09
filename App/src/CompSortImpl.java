import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
	public static void main(String[] args) {
		List<Person> arr = new ArrayList<Person>();
		
		arr.add(new Person("Erik", 30));
		arr.add(new Person("Wesley", 32));
		arr.add(new Person("Leonan", 21));
		arr.add(new Person("Luiz", 31));
		
		for (Person p : arr ) {
			System.out.println(p.getName() + " " + p.getAge() );
		}
		
		System.out.println("");
		
//		Collections.sort((List) arr);
		Collections.sort((List) arr, new Person());
		
		for (Person p : arr ) {
			System.out.println(p.getName() + " " + p.getAge() );
		}
	}
}	
