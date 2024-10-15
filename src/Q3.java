public class Q3 {
    static String name = "Mann";
    int age = 30;


    public void candidate1() {

        System.out.println("Candidate1's name is " + name + " and age is " + age);
    }

    public static void candidate2(){
        Q3 obj = new Q3();
        System.out.println("Candidate2's name is " + name + " and age is " + obj.age);
    }

    public static void main (String[] args){
        //call candidate2 method
        candidate2();
        // create instance of Q3
        Q3 obj = new Q3();
        //call candidate method
        obj.candidate1();
    }
}
