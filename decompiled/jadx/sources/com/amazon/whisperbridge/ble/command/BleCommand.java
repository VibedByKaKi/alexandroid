package com.amazon.whisperbridge.ble.command;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class BleCommand<T> implements Callable<T> {
    public static final int COMMAND_TIMED_OUT = -2;
    public static final int COMMAND_TIMEOUT_SECONDS = 10;
    public static final int FAILED_TO_INITIATE_COMMAND = -1;
    protected T mResult;
    protected final CountDownLatch mResultLatch = new CountDownLatch(1);

    public BleCommand(T t) {
        this.mResult = t;
    }

    public void update(T t) {
        this.mResult = t;
        this.mResultLatch.countDown();
    }
}
