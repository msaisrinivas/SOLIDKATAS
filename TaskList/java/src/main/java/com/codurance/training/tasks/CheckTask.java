package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class CheckTask implements TaskStatusService {
//    @Override
//    public void check(Map<String, List<Task>> tasks, String idString, PrintWriter out) {
//        setDone(tasks,idString, true,out);
//    }
//
//    @Override
//    public void uncheck(Map<String, List<Task>> tasks, String idString, PrintWriter out) {
//        setDone(tasks,idString, false,out);
//    }

    @Override
    public void setDone(Map<String, List<Task>> tasks, String idString, PrintWriter out) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId().equals(idString)) {
                    task.setDone(true);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %s.", idString);
        out.println();
    }
}
