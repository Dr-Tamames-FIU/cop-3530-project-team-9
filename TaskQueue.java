
import java.util.PriorityQueue;
import java.util.Random;

public class TaskQueue
 {
    private PriorityQueue<Task> queue;


    public TaskQueue() {
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
        return new Employee(randomName(), "Customer Service Representative");
    }
        //randomize employee name everytime program is run
    private String randomName()
    {
        String name [] = 
        {
            "John", "Oliver", "Juan", "Andrew", "Pamela", "Dr.Tammames"
        };

        Random rand = new Random();
        return name[rand.nextInt(name.length)];
    }
}
