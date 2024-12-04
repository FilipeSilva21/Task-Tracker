package org.TaskTracker.services;

import java.time.LocalDateTime;

public class StatusService {
    public enum Status {
        Todo(LocalDateTime.now()),
        InProgress (LocalDateTime.now()),
        Done (LocalDateTime.now());

        public final LocalDateTime times;

        Status(LocalDateTime times) {
            this.times = times;
        }

        public LocalDateTime getTime() {
            return times;
        }
    }
}
