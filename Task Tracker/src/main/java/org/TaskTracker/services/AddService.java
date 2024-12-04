package org.TaskTracker.services;

import org.TaskTracker.controller.TaskController;
import org.TaskTracker.entity.Task;

public class AddService {
    public void addTask(int Id, String name, StatusService.Status status){
        Task task = new Task(Id, name, status);
        TaskController.tasks.add(task);
        System.out.println("Nova task " + name + " cadastrada como " + task.getStatus());
    }
}
