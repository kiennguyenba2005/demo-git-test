
import java.util.ArrayList;


public class MyQueue {
    ArrayList al;

    public MyQueue() {
        al = new ArrayList();
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    void enQueue (Object x){
        al.add(x);
    }
    Object deQueue (){
        return al.remove(0);
    }
    
}
