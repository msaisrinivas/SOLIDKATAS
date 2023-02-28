package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class AddTask implements AddService {

    CreatingId creatingId = new CreatingId();

    @Override
    public void add(Map<String, List<Task>> tasks, String commandLine, PrintWriter out) {

        String[] subcommandRest = commandLine.split(" ",2);
        String subcommand = subcommandRest[0];
        String project = subcommandRest[0];
        String[] subcommandTask = subcommandRest[1].split(" ",2);
        String description = subcommandTask[0];
        String taskId = subcommandTask[1].trim();
        List<Task> projectTasks = tasks.get(project);
        if(!Pattern.matches("[A-z0-9]*", taskId)){
            out.printf("Task Id should match this pattern \"no special characters and spaces\".");
            out.println();
            return;
        }
        if (projectTasks == null) {
            out.printf("Could not find a project with the name \"%s\".", project);
            out.println();
            return;
        }
        projectTasks.add(new Task(taskId, description, false,null));
    }
}
