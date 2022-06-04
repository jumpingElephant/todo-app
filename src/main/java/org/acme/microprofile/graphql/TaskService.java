package org.acme.microprofile.graphql;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ApplicationScoped
public class TaskService {

    Map<String, Task> taskMap = new HashMap<>();

    public Task addTask(Task task) {
        task.id = UUID.randomUUID().toString();
        taskMap.put(task.id, task);
        return task;
    }

    public Collection<Task> getAllTasks() {
        return taskMap.values();
    }

    public Task deleteTask(String id) {
        return taskMap.remove(id);
    }
}
