package org.TaskTracker.entity;

import org.TaskTracker.services.StatusService;

import java.time.LocalDateTime;

public class Task {
    public int Id;
    public String name;
    public StatusService.Status status;
    public LocalDateTime time;

    public Task (int Id, String name, StatusService.Status status){
        this.name = name;
        this.Id = Id;
        this.status = status;
        this.time = LocalDateTime.now();
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public StatusService.Status getStatus() {
        return status;
    }
    public void setStatus(StatusService.Status status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
