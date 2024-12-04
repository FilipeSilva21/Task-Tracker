package org.TaskTracker.services;

import org.TaskTracker.entity.Task;

import java.util.List;


public class UpdateService {
    public int Id;
    public String newName;
    public Task name;

    public void updateService(int Id, String newName, Task name){
        this.Id = Id;
        this.newName = newName;
        this.name = name;
    }

    public void updateName (List<Task> task, int Id, String newName){
        for (Task tasks : task){
            if  (tasks.getId() == Id){
                tasks.setName(newName);
                System.out.println("A task " + tasks.getId() + " foi atualizada com sucesso para " + newName);
                return;
            }
        } throw new Error("Task com o Id " + Id + " nao foi encontrada");
    }
}
