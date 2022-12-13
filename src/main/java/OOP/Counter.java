package OOP;


//Static method
public class Counter {
    /*
    public static int count;

}
class Run{
    public static void main(String[] args){
        Counter counter1 = new Counter();
        counter1.count = 7;
        System.out.println(counter1.count);
    }
     */

    /*
    static int count;
    public Counter(){
        count ++ ;
        System.out.println(count);
    }

}

class Run{
    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
    }
     */

    public static int max(int a , int b){
        return (a >=b) ? a:b;
    }
}
class Run{
    public static void main(String[] args){
        System.out.println("Max:" + Math.max(3,6));
    }
}
