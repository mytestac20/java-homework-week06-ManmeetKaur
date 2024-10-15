public class Q4 {
    //instance variable
    int a = 10;
    //instance variable
    String name = "Mann";
    //static variable
    static String city = "London";
    //static variable
    static int population = 2000;

    //Static method
     public static void mixedVariables (){
         // accessing static variables
         System.out.println(population );
         System.out.println(city);
         // creating an instance to access instance variable
         Q4 obj = new Q4();
     }
     //Instance method
     public void mixedVariables2 (){
     // accessing instance variables
        System.out.println(a);
        System.out.println(name);
        //accessing static variables
        System.out.println(city);
         System.out.println(population);

     }

public static void main(String [] args){
         //call static method directly
         mixedVariables();
         // create an instance of Q4
         Q4 obj = new Q4();
         //call instance method
        obj.mixedVariables2();

}


}
