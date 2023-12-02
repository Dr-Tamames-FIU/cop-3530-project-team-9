
import java.util.ArrayList;
import java.util.PriorityQueue;

public interface TaskQueue
 {
    private PriorityQueue<Task> queue;

    TaskQueue() 
    {
        this.queue = new PriorityQueue<>((t1, t2) -> Integer.compare(t2.getPriority(), t1.getPriority()));
    }


    public void enqueue(Task task)
    {
        queue.add(task);
        System.out.println("Task added to the queue: " + task.getDescription());

    }

    public void processTasks()
    {
        while (!queue.isEmpty()) 
        {
            Task currentTask = queue.poll();
            System.out.println("Processing task: " + currentTask.getDescription());
            currentTask.markAsCompleted();
            // Additional processing logic here

            // Assign the task to an employee
            Employee assignedEmployee = getAvailableEmployee();
            currentTask.assignToEmployee(assignedEmployee);
        }

        System.out.println("All tasks completed!");
   
    }

    private Employee getAvailableEmployee() 
    {
        // You can implement logic to retrieve an available employee
        return new Employee("John Doe", "Customer Service Representative");
    }
}
