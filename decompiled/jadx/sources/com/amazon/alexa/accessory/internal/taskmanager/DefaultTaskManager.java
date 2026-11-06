package com.amazon.alexa.accessory.internal.taskmanager;

import com.amazon.alexa.accessory.internal.taskmanager.TaskManager;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultTaskManager implements TaskManager {
    private boolean released;
    private boolean running;
    private TaskInstance runningInstance;
    private final ArrayDeque<TaskInstance> tasks;

    public DefaultTaskManager() {
        Preconditions.mainThread();
        this.tasks = new ArrayDeque<>();
    }

    private void checkNotReleased() {
        if (this.released) {
            Single$$ExternalSyntheticBUOutline0.m$2("Task manager is released and should not be used!");
        }
    }

    private TaskInstance findHighPriorityInstance() {
        Iterator<TaskInstance> it2 = this.tasks.iterator();
        TaskInstance taskInstance = null;
        while (it2.hasNext()) {
            TaskInstance next = it2.next();
            if (taskInstance == null || taskInstance.getPriority() < next.getPriority()) {
                taskInstance = next;
            }
        }
        return taskInstance;
    }

    private TaskInstance findInstanceByTask(TaskManager.Task task) {
        Iterator<TaskInstance> it2 = this.tasks.iterator();
        while (it2.hasNext()) {
            TaskInstance next = it2.next();
            if (next.is(task)) {
                return next;
            }
        }
        return null;
    }

    private boolean isPriorityInBounds(int i) {
        return i >= 0 && i <= 10;
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean dispose(TaskManager.Task task) {
        TaskInstance findInstanceByTask;
        Preconditions.mainThread();
        if (this.released || task == null || (findInstanceByTask = findInstanceByTask(task)) == null) {
            return false;
        }
        this.tasks.remove(findInstanceByTask);
        findInstanceByTask.dispose();
        if (this.runningInstance != findInstanceByTask) {
            return true;
        }
        TaskInstance findHighPriorityInstance = findHighPriorityInstance();
        this.runningInstance = findHighPriorityInstance;
        if (findHighPriorityInstance == null || !this.running) {
            return true;
        }
        findHighPriorityInstance.run();
        return true;
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public void release() {
        Preconditions.mainThread();
        if (this.released) {
            return;
        }
        this.released = true;
        this.running = false;
        TaskInstance taskInstance = this.runningInstance;
        if (taskInstance != null) {
            taskInstance.dispose();
            this.runningInstance = null;
        }
        while (true) {
            TaskInstance poll = this.tasks.poll();
            if (poll == null) {
                return;
            } else {
                poll.dispose();
            }
        }
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean schedule(TaskManager.Task task, int i) {
        Preconditions.mainThread();
        Preconditions.notNull(task, "task");
        Preconditions.precondition(isPriorityInBounds(i), "Invalid priority " + i);
        if (this.released) {
            Logger.d("Task manager is released and cannot schedule tasks!");
            return false;
        }
        TaskInstance taskInstance = new TaskInstance(task, i);
        TaskInstance taskInstance2 = this.runningInstance;
        if (taskInstance2 != null && taskInstance2.getPriority() >= taskInstance.getPriority()) {
            if (taskInstance.getPriority() >= 9) {
                return false;
            }
            Logger.d("There is an existing task running, %s. Adding %s to the current scheduled queue: %s", this.runningInstance, taskInstance, this.tasks);
            this.tasks.add(taskInstance);
            taskInstance.pending();
            return true;
        }
        if (!this.running && taskInstance.getPriority() >= 9) {
            return false;
        }
        this.tasks.add(taskInstance);
        TaskInstance taskInstance3 = this.runningInstance;
        this.runningInstance = taskInstance;
        if (taskInstance3 != null) {
            taskInstance3.suspend();
        }
        if (this.running) {
            taskInstance.run();
            return true;
        }
        taskInstance.pending();
        return true;
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public void start() {
        checkNotReleased();
        Preconditions.mainThread();
        if (this.running) {
            return;
        }
        this.running = true;
        TaskInstance taskInstance = this.runningInstance;
        if (taskInstance != null) {
            taskInstance.run();
        }
    }

    public void stop() {
        Preconditions.mainThread();
        if (this.released || !this.running) {
            return;
        }
        this.running = false;
        TaskInstance taskInstance = this.runningInstance;
        if (taskInstance == null || taskInstance.getPriority() >= 9) {
            return;
        }
        this.runningInstance.suspend();
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean schedule(TaskManager.Task task, int i, TaskManager.Throughput throughput) {
        throw new IllegalStateException("Task manager should not be used with throughput parameter!");
    }
}
