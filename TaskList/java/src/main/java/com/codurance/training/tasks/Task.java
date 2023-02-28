package com.codurance.training.tasks;

import java.util.Date;

public final class Task {
    private final String id;
    private final String description;
    private boolean done;
    private Date deadline;

    public Task(String id, String description, boolean done, Date deadline) {
        this.id = id;
        this.description = description;
        this.done = done;
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        String isDoneValue = isDone() ?  "x" : " ";
        String DeadlineValue = getDeadline() == null ? " " : String.valueOf(getDeadline());
        return "["+isDoneValue + "] " + getId() + ": " + getDescription() + " " + DeadlineValue;
    }
}
