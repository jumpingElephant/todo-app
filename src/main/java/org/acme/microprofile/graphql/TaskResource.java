package org.acme.microprofile.graphql;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.Collection;

@GraphQLApi
public class TaskResource {

    @Inject
    TaskService service;

    @Query("allTasks")
    @Description("Get all tasks")
    public Collection<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @Mutation
    public Task createTask(Task task) {
        return service.addTask(task);
    }

    @Mutation
    public Task deleteHero(String id) {
        return service.deleteTask(id);
    }
}