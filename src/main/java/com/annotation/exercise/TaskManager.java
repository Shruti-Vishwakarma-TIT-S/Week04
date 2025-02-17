package com.annotation.exercise;

// Class to manage tasks
public class TaskManager {

    // Apply the custom annotation to the completeTask method
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        // Print a message when completeTask is called
        System.out.println("Task completed");
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of TaskManager
        TaskManager taskManager = new TaskManager();

        // Call the completeTask method
        taskManager.completeTask();

        // Retrieve the TaskInfo annotation using reflection
        TaskInfo taskInfo = taskManager.getClass().getMethod("completeTask").getAnnotation(TaskInfo.class);

        // Print the annotation details
        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned to: " + taskInfo.assignedTo());
    }
}
