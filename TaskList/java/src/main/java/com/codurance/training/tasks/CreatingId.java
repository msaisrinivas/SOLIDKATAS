package com.codurance.training.tasks;

public class CreatingId {
    int lastId = 0;
    long nextId() {
        return ++lastId;
    }
}
