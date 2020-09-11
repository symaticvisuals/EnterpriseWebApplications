package QueuePrograms;
// Implement a to do list. Tasks have a priority between 1 and 9, and a description.  When the user enters the command add priority description,
// the program adds a new task. When the user enters next, the program removes and prints the most urgent task. The quit command quits the program.
// Use a priority queue in your solution. (30 mins)
//Definition of Done
//Assign priorities b/w 1 to 9 to all the tasksTasks should be added and removed according to the user input
//Finally display the resultant queue

import java.util.*;

public class TODOLIST  {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Comparator<Task>  pri= new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                if(o1.getPriority() < o2.getPriority())
                {
                    return -1;
                }
                else if (o1.getPriority() > o2.getPriority())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        };



        PriorityQueue<Task> queue = new PriorityQueue<>(pri);

        int n =9;
        while(n-- > 0) {
            System.out.print("Enter Priority: ");
            int priority=s.nextInt();
            System.out.print("Enter Description: ");
            String desicription = s.next();

            queue.add(new Task(priority,desicription));
        }

        System.out.println("Want to add more?(Enter 0 for no 1 for yes)");
        int choice = s.nextInt();
        while (choice!=0){
            System.out.print("Enter Priority: ");
            int priority=s.nextInt();
            System.out.print("Enter Description: ");
            String desicription = s.next();
            queue.remove();
            queue.add(new Task(priority,desicription));

            System.out.println("Want to add more?(Enter 0 for no 1 for yes)");
            choice = s.nextInt();
        }
        System.out.println(queue);


    }

//

}
