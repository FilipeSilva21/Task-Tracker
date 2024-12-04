package org.TaskTracker;

import org.TaskTracker.controller.TaskController;
import org.TaskTracker.entity.Task;
import org.TaskTracker.services.*;

import java.util.List;

import static org.TaskTracker.controller.TaskController.tasks;

public class Main {
    public static void main(String[] args) {
        AddService addTask = new AddService();
        RemoveService removeTask = new RemoveService();
        ListService listService = new ListService();
        UpdateService updateTask = new UpdateService();
        TaskController taskController = new TaskController();

        //adicionar tarefas (recebe um Id, nome e status)
        addTask.addTask(1, "Prova", StatusService.Status.InProgress);
        addTask.addTask(2, "Estudar", StatusService.Status.Todo);
        addTask.addTask(3, "Acordar", StatusService.Status.Done);

        /*addTask.addTask(4, "Dormir", StatusService.Status.InProgress);
        addTask.addTask(5, "Comer", StatusService.Status.Todo);
        addTask.addTask(6, "Jogar", StatusService.Status.Done);*/

        System.out.println("");

        //imprime as tarefas feitas
        listService.printDone();

        //imprime as tarefas em progresso
        listService.printInProgress();

        //imprime as tarefas a serem feitas
        listService.printTodo();

        System.out.println("");

        //atualiza o nome da task (recebe o array tasks, um Id e um novo nome
        updateTask.updateName(tasks, 1, "Atividade");

        //deleta uma tarefa
        removeTask.removeTask("Prova", taskController.findById(1));

        System.out.println("");

        //imprime todas as tarefas
        listService.listService();


        //convertendo o arraylist para json
        String jsonOutput = convertToJSON(tasks);

        //imprimindo o json
        System.out.println("\nJSON das Tarefas:");
        System.out.println(jsonOutput);
    }

    //abre um array json
    public static String convertToJSON(List<Task> tasks) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[");

        //percorrer a lista tasks
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            //adiciona os atributos da tarefa em json
            jsonBuilder.append("id: ").append(task.getId()).append(",")
                        .append("name: ").append(task.getName()).append(",")
                        .append("statu: ").append(task.getStatus()).append(",")
                        .append("time: ").append(task.getTime()).append(",");

            //adiciona uma virgula depois de cada item, exceto o ultimo
            if (i < tasks.size() - 1) {
                jsonBuilder.append(",");
            }
        }

        //fecha o array em json
        jsonBuilder.append("]");
        return jsonBuilder.toString();
    }
}

