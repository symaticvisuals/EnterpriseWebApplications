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

        PriorityQueue<Task> queue = new PriorityQueue<>();
        System.out.print("Enter No. of tasks: ");
        int n = s.nextInt();
        while(n-->0) {
            queue.add(new Task(s));
        }

        //Stack<Task> stack = sortQueue(queue);
//        for (Task task:stack) {
//            System.out.print(task.getPriority()+" ");
//            System.out.println(task.getDescription());
//        }

    }

    private static Stack<Task> sortQueue(PriorityQueue<Task> queue) {
        Stack<Task> stack = new Stack<>();
        while(!queue.isEmpty())
        {
            Iterator<Task> itr = queue.iterator();

            if(itr.next().equals(getMax(queue)))
            {
            stack.push(getMax(queue));
            queue.remove(getMax(queue));
            }
        }
        return stack;
    }

    private static Task getMax(Queue<Task> queue) {
        int max= Integer.MIN_VALUE;
        for(Task task:queue)
        {
            if(task.getPriority()>max)
            {
                max= task.getPriority();
            }
        }
        for(Task task:queue)
        {
            if(task.getPriority()==max)
            {
                return task;
            }
        }

        return null;
    }


    static class Task
    {
        int priority;
        String description;

        public int getPriority() {
            return priority;
        }

        public String getDescription() {
            return description;
        }

        public Task(Scanner s) {
            //System.out.print("Enter task Priority: ");
            this.priority =s.nextInt();
            //System.out.print("Enter Description: ");
            this.description = s.next();
        }

    }
}
