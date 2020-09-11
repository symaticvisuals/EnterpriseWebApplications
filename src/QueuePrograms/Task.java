package QueuePrograms;

public class Task {

        int priority;
        String description;

        public int getPriority() {
            return priority;
        }

        public String getDescription() {
            return description;
        }

        public Task(int priority, String description) {
            //System.out.print("Enter task Priority: ");
            this.priority = priority;
            //System.out.print("Enter Description: ");
            this.description = description;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "priority=" + priority +
                    ", description='" + description + '\'' +'\n'+
                    '}';
        }

}
