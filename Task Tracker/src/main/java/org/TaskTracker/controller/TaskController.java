package org.TaskTracker.controller;

import org.TaskTracker.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    public static List<Task> tasks = new ArrayList<>();

    public int findById(int Id) {
        for (int x = 0; x < tasks.size(); x++) {
            if (tasks.get(x).getId() == Id) {
                return x;
            }
        } return 0;
    }
}
