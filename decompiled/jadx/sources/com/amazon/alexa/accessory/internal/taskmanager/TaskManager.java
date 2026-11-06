package com.amazon.alexa.accessory.internal.taskmanager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface TaskManager {
    public static final int PRIORITY_AUDIO = 5;
    public static final int PRIORITY_BACKGROUND = 2;
    public static final int PRIORITY_FOREGROUND = 4;
    public static final int PRIORITY_MAX = 10;
    public static final int PRIORITY_MIN = 0;
    public static final int PRIORITY_NONE = 0;
    public static final int PRIORITY_URGENT = 9;
    public static final int STATE_DISPOSED = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PENDING = 1;
    public static final int STATE_RUNNING = 3;
    public static final int STATE_SUSPENDED = 2;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Task {
        void onStateChanged(int i, int i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Throughput {
        LOW,
        MEDIUM,
        HIGH
    }

    boolean dispose(Task task);

    void release();

    boolean schedule(Task task, int i);

    boolean schedule(Task task, int i, Throughput throughput);

    void start();
}
