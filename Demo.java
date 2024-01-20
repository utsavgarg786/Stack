package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class A {
	
}
class B extends A{
	
}
public class Demo {

	public static void main(String[] args) {
		
		A a = new B();
		List<A> list = new ArrayList<A>();
		List<B> list1 = new ArrayList<B>();
		Predicate<Integer> agePred = age -> age>18 ;
			
			if(agePred.test(10)) {
				System.out.println("Right to vote");
			}
			
		
	}
	
}
