// Java collection frameWork 

//The java colllection framework provides a set of interface and classes 
// implementation various  data structure and algoirthm. these interface
// include several method to perform differnt operation on collections

// The Collection interface is the root interface of the java collection
// framework 

import java.util.ArrayList;
import java.util.List;

public class CF_1 {
	public static void main(String[] args){
		
     List<Integer> list = new ArrayList<>();

	 list.add(11);
	 list.add(98);
	 list.add(87);
	 System.out.println(list);
	 System.out.println(list.size());
	}
}