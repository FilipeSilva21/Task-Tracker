package org.TaskTracker.services;

import org.TaskTracker.controller.TaskController;
import org.TaskTracker.entity.Task;

import static org.TaskTracker.controller.TaskController.tasks;
import static org.TaskTracker.services.StatusService.Status.Done;
import static org.TaskTracker.services.StatusService.Status.Todo;
import static org.TaskTracker.services.StatusService.Status.InProgress;


public class ListService {
    public void listService() {
        for (Task task : TaskController.tasks) {
            System.out.println("ID: " + task.getId() +
                    "\n \t Nome: " + task.getName() +
                    "\n \t Status: " + task.getStatus() +
                    "\n \t Horario de criacao: " + task.time);
        }
    }

    public void printDone() {
        for (Task tasks : tasks) {
            if (tasks.getStatus() == Done) {
                System.out.println("Task: " + tasks.getName() + ", Status: " + Done);
            }
        }
    }

   public void printInProgress() {
        for (Task task : tasks) {
            if (task.getStatus() == InProgress) {
                System.out.println("Task: " + task.getName() + ", Status: " + InProgress);
            }
        }
    }


    public void printTodo() {
        for (Task task : tasks) {
            if (task.getStatus() == Todo) {
                System.out.println("Task: " + task.getName() + ", Status: " + Todo);
            }
        }
    }
}
