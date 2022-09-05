package co.clay;
import java.util.Queue;
import java.util.LinkedList;

class QueueEg {

    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(90);
        numbers.offer(81);
        numbers.offer(27);
        System.out.println("Queue: " + numbers);

        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);
        System.out.println("Queue: " + numbers);
        
        numbers.add(54);
        System.out.println("Queue: " + numbers);


        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}

