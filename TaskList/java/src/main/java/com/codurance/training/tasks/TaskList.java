package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class TaskList implements Runnable {
    private static final String QUIT = "quit";

    private final Map<String, List<Task>> tasks = new LinkedHashMap<>();
    private final BufferedReader in;
    private final PrintWriter out;

    private ShowFucntionService showFucntionService =new ShowFunciton();
    private ShowFucntionService todayService =new Today();
    private ShowFucntionService deadlineShowService =new ViewByDeadline();
    private AddService addProject = new AddProject();
    private AddService addTask = new AddTask();
    private UpdateTaskService checkTask = new CheckTask();
    private UpdateTaskService uncheckTask = new UnCheckTask();
    private UpdateTaskService addDeadline = new AddDeadline();
    private UpdateTaskService deleteTask = new DeleteTask();


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        new TaskList(in, out).run();
    }

    public TaskList(BufferedReader reader, PrintWriter writer) {
        this.in = reader;
        this.out = writer;
    }

    public void run() {
        while (true) {
            out.print("> ");
            out.flush();
            String command;
            try {
                command = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (command.equals(QUIT)) {
                break;
            }
            execute(command);
        }
    }

    private void execute(String commandLine) {
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
                showFucntionService.show(tasks,out);
                break;
            case "add-project":
                addProject.add(tasks,commandRest[1],out);
                break;
            case "add-task":
                addTask.add(tasks,commandRest[1],out);
                break;
            case "check":
                checkTask.setDone(tasks,commandRest[1],out);
                break;
            case "uncheck":
                uncheckTask.setDone(tasks,commandRest[1],out);
                break;
            case "delete":
                deleteTask.setDone(tasks,commandRest[1],out);
                break;
            case "deadline":
                addDeadline.setDone(tasks,commandRest[1],out);
                break;
            case "today":
                todayService.show(tasks,out);
                break;
            case "view-by-deadline":
                deadlineShowService.show(tasks,out);
                break;
            case "help":
                help();
                break;
            default:
                error(command);
                break;
        }
    }

    public void error(String command) {
        out.printf("I don't know what the command \"%s\" is.", command);
        out.println();
    }
    
    private void help() {
        out.println("Commands:");
        out.println("  show");
        out.println("  add-project <project name>");
        out.println("  add-task <project name> <task description> <custom task Id>");
        out.println("  check <task ID>");
        out.println("  uncheck <task ID>");
        out.println("  delete <task ID>");
        out.println("  deadline <task ID> <deadline Date>");
        out.println("  today");
        out.println();
    }

}
