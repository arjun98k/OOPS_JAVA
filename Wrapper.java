public class Wrapper {
	public static void main(String[] args){
		
		// convert interger into
		 // Integer obj = new Integer(98);
		 // System.out.println(obj);
		 // System.out.println(obj.getClass().getName()); 

		Integer obj2 = Integer.valueOf(988);
		System.out.println(obj2.getClass().getName());

		Integer obj3 = 11; //autoboxing
		System.out.println(obj3);

		int age = obj2; 
		System.out.println(age); //unboxing

		String ak = "10";

		Integer obj4 = Integer.valueOf(ak);
		System.out.println(obj4*98);
		
		 

	}
}