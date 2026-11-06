package com.amazon.alexa.accessory.internal.taskmanager;

import com.amazon.alexa.accessory.internal.taskmanager.TaskManager;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.function.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultTaskManagerV2 implements TaskManager {
    private final EnumMap<TaskManager.Throughput, ThroughputQueue> throughputQueues;
    int maxConcurrentTasks = 2;
    private boolean running = false;
    private boolean released = false;

    public DefaultTaskManagerV2() {
        int i = 0;
        Preconditions.mainThread();
        this.throughputQueues = new EnumMap<>(TaskManager.Throughput.class);
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            this.throughputQueues.put((EnumMap<TaskManager.Throughput, ThroughputQueue>) throughput, (TaskManager.Throughput) new ThroughputQueue(this, i));
        }
    }

    private void addTask(TaskInstance taskInstance) {
        this.throughputQueues.get(taskInstance.getThroughput()).getTasks().offer(taskInstance);
    }

    private void clearAllRunningInstances() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            this.throughputQueues.get(throughput).getRunningInstances().clear();
        }
    }

    private void clearAllTasks() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            this.throughputQueues.get(throughput).getTasks().clear();
        }
    }

    private void disposeRunningInstances() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            Iterator<TaskInstance> it2 = this.throughputQueues.get(throughput).getRunningInstances().iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
        }
    }

    private void disposeTasks() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            Iterator<TaskInstance> it2 = this.throughputQueues.get(throughput).getTasks().iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
        }
    }

    private TaskInstance findTaskInstance(TaskManager.Task task) {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            Iterator<TaskInstance> it2 = this.throughputQueues.get(throughput).getTasks().iterator();
            while (it2.hasNext()) {
                TaskInstance next = it2.next();
                if (next.is(task)) {
                    return next;
                }
            }
        }
        return null;
    }

    private TaskInstance highestPriority(ArrayDeque<TaskInstance> arrayDeque) {
        Iterator<TaskInstance> it2 = arrayDeque.iterator();
        TaskInstance taskInstance = null;
        while (it2.hasNext()) {
            TaskInstance next = it2.next();
            if (taskInstance == null || taskInstance.getPriority() < next.getPriority()) {
                taskInstance = next;
            }
        }
        return taskInstance;
    }

    private boolean isDuplicatedUrgentTask(TaskInstance taskInstance, ArrayDeque<TaskInstance> arrayDeque) {
        Iterator<TaskInstance> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            TaskInstance next = it2.next();
            if (next.getTaskName().equals(taskInstance.getTaskName()) && next.getPriority() == 9) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$dispose$0(TaskManager.Task task, TaskInstance taskInstance) {
        return taskInstance.is(task);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$dispose$1(TaskManager.Task task, TaskInstance taskInstance) {
        return taskInstance.is(task);
    }

    private void runTaskInstance(TaskInstance taskInstance) {
        taskInstance.run();
        this.throughputQueues.get(taskInstance.getThroughput()).getRunningInstances().offer(taskInstance);
    }

    private void runTasks() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            ThroughputQueue throughputQueue = this.throughputQueues.get(throughput);
            TaskInstance highestPriority = highestPriority(throughputQueue.getTasks());
            if (highestPriority != null) {
                throughputQueue.getRunningInstances().offer(highestPriority);
                highestPriority.run();
            }
        }
    }

    private boolean scheduleUrgentTask(TaskInstance taskInstance, ArrayDeque<TaskInstance> arrayDeque) {
        if (isDuplicatedUrgentTask(taskInstance, arrayDeque)) {
            return false;
        }
        if (!arrayDeque.isEmpty()) {
            TaskInstance peekFirst = arrayDeque.peekFirst();
            if (peekFirst.getPriority() == 9 && arrayDeque.size() >= this.maxConcurrentTasks) {
                return false;
            }
            if (peekFirst.getPriority() < 9) {
                addTask(taskInstance);
                suspendRunningTaskAndRunNewTask(taskInstance);
                return true;
            }
        }
        addTask(taskInstance);
        runTaskInstance(taskInstance);
        return true;
    }

    private void suspendNonUrgentRunningInstances(TaskManager.Throughput throughput) {
        Iterator<TaskInstance> it2 = this.throughputQueues.get(throughput).getRunningInstances().iterator();
        while (it2.hasNext()) {
            TaskInstance next = it2.next();
            if (next.getPriority() < 9) {
                next.suspend();
            }
        }
    }

    private void suspendNonUrgentTasks() {
        for (TaskManager.Throughput throughput : TaskManager.Throughput.values()) {
            suspendNonUrgentRunningInstances(throughput);
        }
    }

    private void suspendRunningTaskAndRunNewTask(TaskInstance taskInstance) {
        suspendTasks(taskInstance.getThroughput());
        runTaskInstance(taskInstance);
    }

    private void suspendTasks(TaskManager.Throughput throughput) {
        ThroughputQueue throughputQueue = this.throughputQueues.get(throughput);
        Iterator<TaskInstance> it2 = throughputQueue.getRunningInstances().iterator();
        while (it2.hasNext()) {
            it2.next().suspend();
        }
        throughputQueue.getRunningInstances().clear();
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean dispose(final TaskManager.Task task) {
        TaskInstance findTaskInstance;
        Preconditions.mainThread();
        if (this.released || (findTaskInstance = findTaskInstance(task)) == null) {
            return false;
        }
        ThroughputQueue throughputQueue = this.throughputQueues.get(findTaskInstance.getThroughput());
        final int i = 0;
        if (throughputQueue.getTasks().removeIf(new Predicate() { // from class: com.amazon.alexa.accessory.internal.taskmanager.DefaultTaskManagerV2$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$dispose$0;
                boolean lambda$dispose$1;
                int i2 = i;
                TaskManager.Task task2 = task;
                TaskInstance taskInstance = (TaskInstance) obj;
                switch (i2) {
                    case 0:
                        lambda$dispose$0 = DefaultTaskManagerV2.lambda$dispose$0(task2, taskInstance);
                        return lambda$dispose$0;
                    default:
                        lambda$dispose$1 = DefaultTaskManagerV2.lambda$dispose$1(task2, taskInstance);
                        return lambda$dispose$1;
                }
            }
        })) {
            findTaskInstance.dispose();
        }
        final int i2 = 1;
        throughputQueue.getRunningInstances().removeIf(new Predicate() { // from class: com.amazon.alexa.accessory.internal.taskmanager.DefaultTaskManagerV2$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$dispose$0;
                boolean lambda$dispose$1;
                int i22 = i2;
                TaskManager.Task task2 = task;
                TaskInstance taskInstance = (TaskInstance) obj;
                switch (i22) {
                    case 0:
                        lambda$dispose$0 = DefaultTaskManagerV2.lambda$dispose$0(task2, taskInstance);
                        return lambda$dispose$0;
                    default:
                        lambda$dispose$1 = DefaultTaskManagerV2.lambda$dispose$1(task2, taskInstance);
                        return lambda$dispose$1;
                }
            }
        });
        if (!this.running || !throughputQueue.getRunningInstances().isEmpty() || throughputQueue.getTasks().isEmpty()) {
            return true;
        }
        runTaskInstance(throughputQueue.getTasks().peekFirst());
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
        disposeRunningInstances();
        clearAllRunningInstances();
        disposeTasks();
        clearAllTasks();
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean schedule(TaskManager.Task task, int i, TaskManager.Throughput throughput) {
        Preconditions.mainThread();
        TaskInstance taskInstance = new TaskInstance(task, i, throughput);
        ArrayDeque<TaskInstance> runningInstances = this.throughputQueues.get(throughput).getRunningInstances();
        if (!this.running) {
            if (i == 9) {
                return false;
            }
            taskInstance.pending();
            addTask(taskInstance);
            return true;
        }
        if (i == 9) {
            return scheduleUrgentTask(taskInstance, runningInstances);
        }
        addTask(taskInstance);
        if (runningInstances.isEmpty()) {
            runTaskInstance(taskInstance);
            return true;
        }
        if (runningInstances.peekFirst().getPriority() < i) {
            suspendRunningTaskAndRunNewTask(taskInstance);
            return true;
        }
        taskInstance.pending();
        return true;
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public void start() {
        if (this.released) {
            Single$$ExternalSyntheticBUOutline0.m$2("Task manager is released and should not be used!");
            return;
        }
        Preconditions.mainThread();
        if (this.running) {
            return;
        }
        this.running = true;
        runTasks();
    }

    public void stop() {
        Preconditions.mainThread();
        if (this.released || !this.running) {
            return;
        }
        this.running = false;
        suspendNonUrgentTasks();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ThroughputQueue {
        private final ArrayDeque<TaskInstance> runningInstances;
        private final ArrayDeque<TaskInstance> tasks;

        private ThroughputQueue() {
            this.tasks = new ArrayDeque<>();
            this.runningInstances = new ArrayDeque<>();
        }

        public ArrayDeque<TaskInstance> getRunningInstances() {
            return this.runningInstances;
        }

        public ArrayDeque<TaskInstance> getTasks() {
            return this.tasks;
        }

        public /* synthetic */ ThroughputQueue(DefaultTaskManagerV2 defaultTaskManagerV2, int i) {
            this();
        }
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager
    public boolean schedule(TaskManager.Task task, int i) {
        return schedule(task, i, TaskManager.Throughput.LOW);
    }
}
