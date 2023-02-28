package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ShowFunciton implements ShowFucntionService {

    @Override
    public void show(Map<String, List<Task>> tasks, PrintWriter out) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            for (Task task : project.getValue()) {
                out.println(task.toString());
            }
            out.println();
        }
    }

//    @Override
//    public void today(Map<String, List<Task>> tasks, PrintWriter out) {
//
//    }

//    @Override
//    public void error(String command, PrintWriter out) {
//        out.printf("I don't know what the command \"%s\" is.", command);
//        out.println();
//    }

}
