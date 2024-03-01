package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda3 {
	
	public static void main(String[] args) {
		
		List <Product> list = new ArrayList <Product>();
		list.add(new Product(1,"Hp Laptop",25000f));
		list.add(new Product(2,"Keyboard",250f));
		list.add(new Product(3,"Dell Mouse",150f));
		
		System.out.println("sorting on the basis of name......");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p: list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
	}

}
