import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class QueueTest{
    public static void main(String[] args){
        Queue ap = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            ap.offer(i);
        }
        System.out.println(ap);
        System.out.println(ap.poll());
        System.out.println(ap);
        System.out.println(ap.element());
        System.out.println("=============================================");
        Queue ap1 = new PriorityQueue<>();
        ap1.add(22);
        ap1.add(2);
        ap1.add(32);
        ap1.add(112);
        ap1.add(12);
        System.out.println(ap1);
        System.out.println(ap1.poll());
        System.out.println(ap1);
        System.out.println(ap1.element());
    }
}
