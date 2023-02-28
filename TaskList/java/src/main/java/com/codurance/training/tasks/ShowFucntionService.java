package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public interface ShowFucntionService {
    void show(Map<String, List<Task>> tasks, PrintWriter out);

//    void today(Map<String, List<Task>> tasks, PrintWriter out);
//
//    void error(String command, PrintWriter out);
}
