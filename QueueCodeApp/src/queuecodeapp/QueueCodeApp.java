package queuecodeapp;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCodeApp {

    public static void main(String[] args) {
        //Declare and initialize a Queue that can store String objects representing customer names
       Queue<String> queueList =new LinkedList<>(); 
       
       //Add the following customers to the queue in this order: Alice, Bob,Charlie, Diana, Eve
       queueList.add("Alice");
       queueList.add("Bob");
       queueList.add("Charlie");
       queueList.add("Diana");
       queueList.add("Eve");
       
       //Print the current queue
        System.out.println("Current queue : "+queueList);
        
       //Serve the first two customers (remove them from the queue) and print their names
       String firstRemove = queueList.poll();
       System.out.println("First remove in the list : "+firstRemove);
       String secondRemove = queueList.poll();
       System.out.println("Second remove in the list : "+secondRemove);
        
       // Print the queue after serving the first two customers
       System.out.println("After remove of the first two in list : "+queueList);
       
       
       //Add two more customers to the queue: Frank and Grace
       queueList.add("Frank");
       queueList.add("Grace");
       
       //Print the final state of the queue.
       System.out.println("After adding two from the list : "+queueList);
       
    }
    
}
