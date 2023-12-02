
/**
 * Team members: Oliver Felipe, Juan Rivera, Andrew Schreiber, Pamela Mauna
 * Group: 9 & 17
 * Implementation: To Do queue system to utilizes the principle of priority queue
 * 
*/

public class ToDoList 
{
    public static void main(String[] args) 
    {
        TaskQueue customerServiceQueue = new TaskQueue();

        //Tasks added to the queue
        Task task1 = new Task("Handle customer inquiry", 1);
        Task task2 = new Task("Process refund request", 2);

        customerServiceQueue.enqueue(task1);
        customerServiceQueue.enqueue(task2);

        customerServiceQueue.processTasks();
        

    }
}
