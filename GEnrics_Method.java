public class GEnrics_Method {
    // using method overloading
    // public static void Print(int a){
    //     System.out.println(a);

    // }

    // public static void Print(String a){
    //     System.out.println(a);
    // }
     

     //Using Genrics
      public static<M> void Print(M data){
        System.out.println(data);

      }
    public static void main(String[] args) {
        
        // Print(11);
        // Print("arjun");

          Print(11);
          Print("Akash AI engineer");

    }
}
