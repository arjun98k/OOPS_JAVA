public class Genrics_3 {
	public static void main(String[] args){
		Dog<Integer> D1 = new Dog<>(98);
	
		Dog<String> D2 = new Dog<>("hii");
		System.out.println(D1.GetData());
		
		

	}
}
class Dog<E>{
	E adtiya;
	public Dog(E adtiya){
      this.adtiya = adtiya;


		
	}
	E GetData(){
		return adtiya;
	}
}