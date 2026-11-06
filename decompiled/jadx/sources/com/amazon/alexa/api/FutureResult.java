package com.amazon.alexa.api;

import android.os.ConditionVariable;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class FutureResult<T> implements Callable<T> {
    private static final String TAG = "FutureResult";
    private final ConditionVariable condition = new ConditionVariable();
    private final T defaultValue;
    private T result;
    private final long timeout;

    public FutureResult(long j, @Nullable T t) {
        this.timeout = j;
        this.defaultValue = t;
    }

    @Override // java.util.concurrent.Callable
    public synchronized T call() throws RemoteException {
        T t = this.result;
        if (t != null) {
            return t;
        }
        Log.i(TAG, MarkdownConstants.LEFT_BRACKET + Thread.currentThread() + "] executing");
        execute();
        this.condition.block(this.timeout);
        T t2 = this.result;
        if (t2 != null) {
            return t2;
        }
        return this.defaultValue;
    }

    public abstract void execute() throws RemoteException;

    public void setResult(T t) {
        this.result = t;
        this.condition.open();
        Log.i(TAG, MarkdownConstants.LEFT_BRACKET + Thread.currentThread() + "] got a result");
    }
}
