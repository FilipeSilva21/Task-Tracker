package org.TaskTracker.services;

import org.TaskTracker.controller.TaskController;
import org.TaskTracker.entity.Task;

public class RemoveService {
    public void removeTask (String name, int Id) {
        TaskController.tasks.remove(Id);
        System.out.println("A task " + name + " foi removida");
    }
}
