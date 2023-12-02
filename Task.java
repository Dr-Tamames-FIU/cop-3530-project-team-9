public class Task implements Assignable 
{
    private String description;
    private boolean completed;
    private int priority;

    public Task(String description, int priority) 
    {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public String getDescription() 
    {
        return description;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public int getPriority() 
    {
        return priority;
    }

    public void markAsCompleted() 
    {
        this.completed = true;
    }

    @Override
    public void assignToEmployee(Employee employee) 
    {
        System.out.println("Task assigned to " + employee.getName());
    }
}