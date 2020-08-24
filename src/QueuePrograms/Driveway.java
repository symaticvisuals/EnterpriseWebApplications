package QueuePrograms;

import java.util.*;

public class Driveway {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> parking = new Stack<>();

        System.out.print("Enter no. of cars to park: ");
        int n = s.nextInt();
        while(n-->0)
        {
            parking.push(s.nextInt());
        }
        display(parking);
        System.out.print("Enter car want to remove: ");
        int car = s.nextInt();
        Stack<Integer> updated = freespace(car,parking);
        display(updated);

    }
    public static Stack<Integer> freespace(Integer car, Stack<Integer> parking)
    {
        Queue<Integer> street = new LinkedList<>() ;

        while(!parking.isEmpty())
        {
            if(parking.peek().equals(car))
            {
                break;
            }
            else
            {
                street.add(parking.pop());
            }
        }
        System.out.println("car removed");
        parking.pop();
        while (!street.isEmpty())
        {
            parking.push(street.remove());
        }
        return parking;
    }
    public static void display(Stack<Integer> stack)
    {
        for (Integer str:stack) {
            System.out.println(str);
        }
    }
}
