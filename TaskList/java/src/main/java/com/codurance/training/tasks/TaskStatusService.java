package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public interface TaskStatusService {

    void setDone(Map<String, List<Task>> tasks,String idString, PrintWriter out);
}
