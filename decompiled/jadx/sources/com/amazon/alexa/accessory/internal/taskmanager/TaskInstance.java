package com.amazon.alexa.accessory.internal.taskmanager;

import com.amazon.alexa.accessory.internal.taskmanager.TaskManager;
import com.amazon.alexa.accessory.internal.util.LoggerUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class TaskInstance {
    private final int priority;
    private int state;
    private final TaskManager.Task task;
    private final TaskManager.Throughput throughput;

    public TaskInstance(TaskManager.Task task, int i) {
        this.task = task;
        this.priority = i;
        this.throughput = TaskManager.Throughput.LOW;
        this.state = 0;
    }

    private void changeState(int i) {
        int i2 = this.state;
        if (i2 == i) {
            return;
        }
        LoggerUtils.taskState(this.task, getStateName(i2), getStateName(i), this.priority);
        int i3 = this.state;
        this.state = i;
        this.task.onStateChanged(i3, i);
    }

    private static String getStateName(int i) {
        return i == 0 ? "STATE_NONE" : i == 1 ? "STATE_PENDING" : i == 2 ? "STATE_SUSPENDED" : i == 3 ? "STATE_RUNNING" : i == 4 ? "STATE_DISPOSED" : "INVALID_STATE";
    }

    public void dispose() {
        if (this.state != 0) {
            changeState(4);
        }
    }

    public int getPriority() {
        return this.priority;
    }

    public String getTaskName() {
        return this.task.toString();
    }

    public TaskManager.Throughput getThroughput() {
        return this.throughput;
    }

    public boolean is(TaskManager.Task task) {
        return this.task == task;
    }

    public void pending() {
        if (this.state == 0) {
            changeState(1);
        }
    }

    public void run() {
        if (this.state != 4) {
            changeState(3);
        }
    }

    public void suspend() {
        if (this.state == 3) {
            changeState(2);
        }
    }

    public String toString() {
        return String.format("'%s' (priority: %d)", this.task, Integer.valueOf(this.priority));
    }

    public TaskInstance(TaskManager.Task task, int i, TaskManager.Throughput throughput) {
        this.task = task;
        this.priority = i;
        this.throughput = throughput;
        this.state = 0;
    }
}
